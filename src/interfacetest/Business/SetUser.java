package interfacetest.Business;

import interfacetest.cipher.XKEncryptUtil;
import interfacetest.constant.FileNameConstants;
import interfacetest.constant.InterfaceConstants;

public class SetUser {
    User user = new User();

    XKEncryptUtil xkEncryptUtil = XKEncryptUtil.getXkEncryptUtilInstance();

    public User setsmscode() {
        user.setSrc_type(InterfaceConstants.TEXT_HECADRE_APP);
        user.setPf_type(InterfaceConstants.TEXT_ANDROID);
        user.setSms_code_type(1);
        user.setMobile(InterfaceConstants.STRING_MOBILE);
        return user;
    }

    public User setuserbasicinfo() {
        user.setSrc_type(InterfaceConstants.TEXT_HECADRE_APP);
        user.setPf_type(InterfaceConstants.TEXT_ANDROID);
        user.setDev_id("36c13a422422cbed");
        return user;
    }

    public User setAddUser() {
        String transforPWD = xkEncryptUtil.getTransformPwd(InterfaceConstants.STRING_PASSWD);
        user.setSrc_type(InterfaceConstants.TEXT_HECADRE_APP);
        user.setPf_type(InterfaceConstants.TEXT_ANDROID);
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


    public User setcheckver() {
        user.setSrc_type(InterfaceConstants.TEXT_HECADRE_APP);
        user.setPf_type(InterfaceConstants.TEXT_ANDROID);
        user.setDev_id(InterfaceConstants.STRING_DEV_ID);
        user.setVer(InterfaceConstants.TEXT_MOBILE);
        user.setVer_code(104);
        return user;
    }


}
