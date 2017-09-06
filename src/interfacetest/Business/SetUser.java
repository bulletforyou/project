package interfacetest.Business;

import interfacetest.cipher.XKEncryptUtil;
import interfacetest.constant.FileNameConstants;
import interfacetest.constant.InterfaceConstants;

public class SetUser {
    User user = new User();

    XKEncryptUtil xkEncryptUtil = XKEncryptUtil.getXkEncryptUtilInstance();

    public User setSmscode() {
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setSms_code_type(2);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        return user;
    }

    public User setUserbasicinfo() {
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);
        return user;
    }

    public User setAddUser() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setUser_id(InterfaceConstants.LONG_USERID);
        user.setAuth_str(xkEncryptUtil.getAuthStr(InterfaceConstants.STRING_USER_NAME, transforPWD));
        user.setLogin_name(InterfaceConstants.STRING_USER_NAME);
        user.setPerson_id(InterfaceConstants.STRING_PERSON_ID);
        user.setIs_real_name(1);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        user.setPasswd_str(InterfaceConstants.STRING_PASSWD);
        user.setName("世外桃源");
        user.setEmail("a@gmail.com");
        user.setSex(1);
        user.setHead_pic_url(FileNameConstants.STRING_HEAD_PIC_URL);
        user.setPerson_id_pic_url(FileNameConstants.STRING_PERSON_ID_PIC_URL);
        return user;
    }


    public User setCheckver() {
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);
        user.setVer(InterfaceConstants.STRING_VER);
        user.setVer_code(InterfaceConstants.LONG_VER_CODE);
        return user;
    }


    public User registerUser() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setPerson_id(InterfaceConstants.STRING_PERSON_ID);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        user.setSms_code("111111");//不能获取，使用固定验证码
        user.setPasswd_str(InterfaceConstants.STRING_PASSWD);
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);

        return user;
    }

    public User userLogin() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setLogin_name(InterfaceConstants.STRING_USER_NAME);
        user.setLogin_auth_str(xkEncryptUtil.getAuthStr(InterfaceConstants.STRING_USER_NAME, transforPWD));
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);
        return user;
    }
    public User getUserInfo() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setUser_id(InterfaceConstants.LONG_USERID);
        user.setLogin_auth_str(xkEncryptUtil.getAuthStr(InterfaceConstants.STRING_USER_NAME, transforPWD));
        user.setUser_id_get(InterfaceConstants.ARRAY_USER_ID);
        user.setPerson_id_get(InterfaceConstants.ARRAY_PERSON_ID_GET);
        user.setName_get(InterfaceConstants.ARRAY_NAME_GET);
        return user;
    }

    public User setUserInfo() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setUser_id(InterfaceConstants.LONG_USERID);
        user.setLogin_auth_str(xkEncryptUtil.getAuthStr(InterfaceConstants.STRING_USER_NAME, transforPWD));
        user.setUser_id_mod(InterfaceConstants.LONG_USERID);
        user.setPerson_id(InterfaceConstants.STRING_PERSON_ID);
        user.setIs_real_name(InterfaceConstants.NUMBER_ONE);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        user.setPasswd_str(InterfaceConstants.STRING_PASSWD);
        user.setName(InterfaceConstants.STRING_USER_NAME);
        user.setEmail(InterfaceConstants.STRING_EMAIL);
        user.setSex(InterfaceConstants.NUMBER_ONE);
        user.setHead_pic_url(FileNameConstants.STRING_HEAD_PIC_URL);
        user.setPerson_id_pic_url(FileNameConstants.STRING_PERSON_ID_PIC_URL);
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);
        return user;
    }
    public User resetUserPasswd() {
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setLogin_name(InterfaceConstants.STRING_USER_NAME);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        user.setSms_code("123456");//需要使用固定验证码
        user.setPasswd_str(InterfaceConstants.STRING_PASSWD);
        return user;
    }

    public User setUserMobile() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.STRING_HECADRE_APP);
        user.setPf_type(InterfaceConstants.STRING_ANDROID);
        user.setUser_id(InterfaceConstants.LONG_USERID);
        user.setAuth_str(xkEncryptUtil.getAuthStr(InterfaceConstants.STRING_USER_NAME, transforPWD));
        user.setNew_mobile(InterfaceConstants.STRING_NEW_MOBILE);
        user.setSms_code("123456");//需要使用固定验证码
        return user;
    }

}
