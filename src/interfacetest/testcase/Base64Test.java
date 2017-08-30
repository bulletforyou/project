package interfacetest.testcase;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import interfacetest.cipher.XKEncryptUtil;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.Base64;

public class Base64Test {
    XKEncryptUtil Instance= XKEncryptUtil.getXkEncryptUtilInstance();

    @Test
    public void testT(){
    String str = "HelloWorld";
    try {
        byte[] encodeBase64 = Base64.encodeBase64(str.getBytes("UTF-8"));
        System.out.println("RESULT: " + new String(encodeBase64));
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    }

    public static final String  pwd="123456";
    public static final String loginName="abc";


    /**
     * 界面输入密码加密
     */
    public String testGetTransformPwd(){
        String result=Instance.getTransformPwd(pwd);
//        System.out.println(result);
        return result;

    }

    /**
     * 传输密码,AES加密
     */
    @Test
    public void testGetTransportPwd(){
        String result=Instance.getTransportPwd(testGetTransformPwd());
//        System.out.println(result);

    }


    @Test
    public  void testGetAuthStr(){
        String transformPwd=Instance.getTransformPwd(loginName);
    }
}