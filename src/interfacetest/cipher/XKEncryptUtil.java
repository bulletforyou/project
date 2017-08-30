package interfacetest.cipher;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import interfacetest.constant.InterfaceConstants;

public class XKEncryptUtil {

private static XKEncryptUtil xkEncryptUtil;
private CipherServiceImpl cipherService;
private SimpleDateFormat formatter;

    Map hashMap=new HashMap();

    private XKEncryptUtil() {
        cipherService = new CipherServiceImpl();
        formatter = new SimpleDateFormat("yyyyMMddHHmmss");
    }

    public static synchronized XKEncryptUtil getXkEncryptUtilInstance() {
        if (xkEncryptUtil == null) {
            xkEncryptUtil = new XKEncryptUtil();
        }
        return xkEncryptUtil;
    }

    /**
     * 生成变换后的密码
     *
     * @return
     */
    public String getTransformPwd(String pwd) {
        String transformPwd = MD5Util.getMD5String(InterfaceConstants.CIPHER_PWD_PREFIX + pwd + InterfaceConstants.CIPHER_PWD_SUFFIX);
        return transformPwd.toUpperCase();
    }

    /**
     * 生成传输密码（对变换后的密码进行aes加密得到的）
     *
     * @param transformPwd
     * @return
     */
    public String getTransportPwd(String transformPwd) {
        try {
            return cipherService.cipher(transformPwd, InterfaceConstants.CIPHER_PWD_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    /**
     * 生成认证字串
     *
     * @param loginName    登录名
     * @param transformPwd 变换后的密码
     * @return
     */
    public String getAuthStr(String loginName, String transformPwd) {
        String randomKey = cipherService.randomKey32();
        hashMap.put(InterfaceConstants.SP_KEY_RANDOM_SECRET, randomKey);
        String text = randomKey + loginName + currentDateStr();

        try {
            return cipherService.cipher(text, transformPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 用传输秘钥生成通信认证字串(服务登录之后，每次交互携带的认证字串)
     *
     * @param loginName 登录名
     * @return
     */
    public String getCorrespondAuthStr(String loginName) {
        String randomKey = cipherService.randomKey32();
//        String transportSecret = spUtils.getString(InterfaceConstants.SP_KEY_TRANSPORT_SECRET, "");
        String transportSecret=hashMap.get(InterfaceConstants.SP_KEY_TRANSPORT_SECRET).toString();
        String text =randomKey+loginName + currentDateStr();

        try {
            return cipherService.cipher(text, transportSecret);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    // 返回null表示解析失败
    public List<String> parseClearText(String clearText, boolean withKey, boolean withSrcType) {
        int minLen = InterfaceConstants.AUTH_DATE_LEN;
        if (withKey) {
            minLen += InterfaceConstants.AUTH_KEY_LEN;
        }

        if (withSrcType) {
            minLen += 3; // srcType和登录名使用 / 分隔
        } else {
            minLen += 1;
        }

        int len = clearText.length();
        if (len < minLen)
            return null;

        List<String> listStr = new ArrayList<String>();
        if (withKey) {
            listStr.add(clearText.substring(0, 32));    // key
            if (withSrcType) {
                String tmp = clearText.substring(32, len - 14);
                String[] tmparr = tmp.split(InterfaceConstants.AUTH_SRCNAME_SEP);
                if (tmparr.length != 2)
                    return null;
                listStr.add(tmparr[0]);    // src type
                listStr.add(tmparr[1]);    // login name
            } else {
                listStr.add(clearText.substring(32, len - 14));    // login name
            }
        } else {
            if (withSrcType) {
                String tmp = clearText.substring(0, len - 14);
                String[] tmparr = tmp.split(InterfaceConstants.AUTH_SRCNAME_SEP);

                if (tmparr.length != 2)
                    return null;
                listStr.add(tmparr[0]);    // src type
                listStr.add(tmparr[1]);    // login name
            } else {
                listStr.add(clearText.substring(0, len - 14));    // login name
            }
        }
        listStr.add(clearText.substring(len - 14));    // date

        return listStr;
    }


    /**
     * 认证登录响应是否过期
     *
     * @param dateToken
     * @return
     * @throws Exception
     */
    public boolean isRequestExipred(String dateToken) throws Exception {
        return isExpired(dateToken, InterfaceConstants.REQUEST_TIMEOUT);
    }

    private boolean  isExpired(String dateToken, long timeout) throws Exception {
        Date date = formatter.parse(dateToken),now = new Date();

        if (Math.abs(now.getTime() - date.getTime()) > timeout) {
            return true;
        }
        return false;
    }

    // 返回: 示例 20170419111534

    /**
     * 前端系统UTC时间yyyyMMddhhmmss
     *
     * @return
     */
    private String currentDateStr() {
        return formatter.format(new Date());
    }

    public CipherServiceImpl getCipherService() {
        return cipherService;
    }
}
