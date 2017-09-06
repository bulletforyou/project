package interfacetest.Business;
import interfacetest.constant.InterfaceConstants;

import java.util.HashMap;
import java.util.Map;

import interfacetest.systemutils.JsonUtils;

public class CreateUser {
    SetUser setUser=new SetUser();
    Map map=new HashMap<>();
    public String getSmscode(){
            map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setSmscode().getSrc_type());
            map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setSmscode().getPf_type());
            map.put(InterfaceConstants.TEXT_SMS_CODE_TYPE,setUser.setSmscode().getSms_code_type());
            map.put(InterfaceConstants.TEXT_MOBILE,setUser.setSmscode().getMobile());
            String json= JsonUtils.toJson(map);
            return json;
    }


    public String getUserbasicinfo(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setUserbasicinfo().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setUserbasicinfo().getPf_type());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setUserbasicinfo().getDev_id());
        String json=JsonUtils.toJson(map);
        return json;
    }

    public String getCheckver(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setCheckver().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setCheckver().getPf_type());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setCheckver().getDev_id());
        map.put(InterfaceConstants.TEXT_VER,setUser.setCheckver().getVer());
        map.put(InterfaceConstants.TEXT_VER_CODE,setUser.setCheckver().getVer_code());
        String json=JsonUtils.toJson(map);
        return json;
    }

    public String getAdduser(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setAddUser().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setAddUser().getPf_type());
        map.put(InterfaceConstants.TEXT_USER_ID,setUser.setAddUser().getUser_id());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.setAddUser().getAuth_str());
        map.put(InterfaceConstants.TEXT_LOGIN_NAME,setUser.setAddUser().getLogin_name());
        map.put(InterfaceConstants.TEXT_PERSON_ID,setUser.setAddUser().getPerson_id());
        map.put(InterfaceConstants.TEXT_IS_REAL_NAME,setUser.setAddUser().getIs_real_name());
        map.put(InterfaceConstants.TEXT_MOBILE,setUser.setAddUser().getMobile());
        map.put(InterfaceConstants.TEXT_PASSWD_STR,setUser.setAddUser().getPasswd_str());
        map.put(InterfaceConstants.TEXT_NAME,setUser.setAddUser().getName());
        map.put(InterfaceConstants.TEXT_EMAIL,setUser.setAddUser().getEmail());
        map.put(InterfaceConstants.TEXT_SEX,setUser.setAddUser().getSex());
        map.put(InterfaceConstants.TEXT_HEAD_PIC_URL,setUser.setAddUser().getHead_pic_url());
        map.put(InterfaceConstants.TEXT_PERSON_ID_PIC_URL,setUser.setAddUser().getPerson_id_pic_url());
        String json=JsonUtils.toJson(map);
        return json;
    }


    public String getRegisterUser(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setAddUser().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setAddUser().getPf_type());
        map.put(InterfaceConstants.TEXT_PERSON_ID,setUser.setAddUser().getPerson_id());
        map.put(InterfaceConstants.TEXT_MOBILE,setUser.setAddUser().getMobile());
        map.put(InterfaceConstants.TEXT_SMS_CODE,setUser.setAddUser().getSms_code());
        map.put(InterfaceConstants.TEXT_PASSWD_STR,setUser.setAddUser().getPasswd_str());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setAddUser().getDev_id());
        String json=JsonUtils.toJson(map);
        return json;
    }


    public String getUserLogin(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.userLogin().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.userLogin().getPf_type());
        map.put(InterfaceConstants.TEXT_LOGIN_NAME,setUser.userLogin().getLogin_name());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.userLogin().getLogin_auth_str());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.userLogin().getDev_id());
        String json=JsonUtils.toJson(map);
        return json;
    }

    /*
        @func 修改用户信息

        @para

        {
          "src_type":"xx" //请求源的类型，如"HECadre APP"、"Inhabitant APP"等
          "pf_type":"xx" //请求源的终端平台类型，如"Android"、"iOS"、"Web"等
          "user_id":0L //用户ID，u64
          "auth_str":"xx" //通信认证密文串
          "user_id_mod":0L //要修改的用户ID，u64，可选，修改自己的信息时不携带
          //以下为要修改的用户信息
          "person_id":"xx" //身份证号码
           "is_real_name":0 //实名认证标志，u8，1：已确认实名，2：未确认实名
          "mobile":"xx" //手机号码
          "passwd_str":"xx" //密码密文串，可用于修改密码
          "name":"xx" //真实姓名
          "email":"xx" //邮件地址
          "sex":0 //性别，u8，1：男，2：女
          "head_pic_url":"xx" //头像URL
          "person_id_pic_url":"xx" //身份证图片
          "dev_id":"xx" //设备ID，可用于修改或清空设备绑定
        }

     */
    public String getUserInfo(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.getUserInfo().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.getUserInfo().getPf_type());
        map.put(InterfaceConstants.TEXT_USER_ID,setUser.getUserInfo().getUser_id());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.getUserInfo().getLogin_auth_str());
        map.put(InterfaceConstants.TEXT_USER_ID_GET,setUser.getUserInfo().getUser_id_get());
        map.put(InterfaceConstants.TEXT_PERSON_ID_GET,setUser.getUserInfo().getPerson_id_get());
        map.put(InterfaceConstants.TEXT_NAME_GET,setUser.getUserInfo().getName_get());
        String json=JsonUtils.toJson(map);
        return json;
    }

    /*
        @func 修改用户信息

        @para
        {
          "src_type":"xx" //请求源的类型，如"HECadre APP"、"Inhabitant APP"等
          "pf_type":"xx" //请求源的终端平台类型，如"Android"、"iOS"、"Web"等
          "user_id":0L //用户ID，u64
          "auth_str":"xx" //通信认证密文串
          "user_id_mod":0L //要修改的用户ID，u64，可选，修改自己的信息时不携带
          //以下为要修改的用户信息
          "person_id":"xx" //身份证号码
           "is_real_name":0 //实名认证标志，u8，1：已确认实名，2：未确认实名
          "mobile":"xx" //手机号码
          "passwd_str":"xx" //密码密文串，可用于修改密码
          "name":"xx" //真实姓名
          "email":"xx" //邮件地址
          "sex":0 //性别，u8，1：男，2：女
          "head_pic_url":"xx" //头像URL
          "person_id_pic_url":"xx" //身份证图片
          "dev_id":"xx" //设备ID，可用于修改或清空设备绑定
        }
     */
    public String setUserInfo(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setUserInfo().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setUserInfo().getPf_type());
        map.put(InterfaceConstants.TEXT_USER_ID,setUser.setUserInfo().getUser_id());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.setUserInfo().getLogin_auth_str());
        map.put(InterfaceConstants.TEXT_USER_ID_MOD,setUser.setUserInfo().getUser_id());
        map.put(InterfaceConstants.TEXT_PERSON_ID   ,setUser.setUserInfo().getPerson_id());
        map.put(InterfaceConstants.TEXT_IS_REAL_NAME,setUser.setUserInfo().getIs_real_name());
        map.put(InterfaceConstants.TEXT_MOBILE,setUser.setUserInfo().getMobile());
        map.put(InterfaceConstants.TEXT_PASSWD_STR,setUser.setUserInfo().getPasswd_str());
        map.put(InterfaceConstants.TEXT_NAME,setUser.setUserInfo().getName());
        map.put(InterfaceConstants.TEXT_EMAIL,setUser.setUserInfo().getEmail());
        map.put(InterfaceConstants.TEXT_SEX,setUser.setUserInfo().getSex());
        map.put(InterfaceConstants.TEXT_HEAD_PIC_URL,setUser.setUserInfo().getHead_pic_url());
        map.put(InterfaceConstants.TEXT_PERSON_ID_PIC_URL,setUser.setUserInfo().getPerson_id_pic_url());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setUserInfo().getDev_id());
        String json=JsonUtils.toJson(map);
        return json;
    }
    /*
    @func:重置用户密码
    @para:
        {
      "src_type":"xx" //请求源的类型，如"HECadre APP"、"Inhabitant APP"等
      "pf_type":"xx" //请求源的终端平台类型，如"Android"、"iOS"、"Web"等
      "login_name":"xx" //需重置密码的用户登录名，或身份证号码
      "mobile":"xx" //需重置密码的用户手机号码
      "sms_code":"xx" //短信验证码
      "passwd_str":"xx" //密码密文串
    }
     */
    public String resetUserPasswd(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.resetUserPasswd().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.resetUserPasswd().getPf_type());
        map.put(InterfaceConstants.TEXT_LOGIN_NAME,setUser.resetUserPasswd().getLogin_name());
        map.put(InterfaceConstants.TEXT_MOBILE,setUser.resetUserPasswd().getMobile());
        map.put(InterfaceConstants.TEXT_SMS_CODE,setUser.resetUserPasswd().getSms_code());
        map.put(InterfaceConstants.TEXT_PASSWD_STR,setUser.resetUserPasswd().getPasswd_str());
        String json=JsonUtils.toJson(map);
        return json;
    }



    /*
    @func:修改用户手机号码

    @para:
        {
      "src_type":"xx" //请求源的类型，如"HECadre APP"、"Inhabitant APP"等
      "pf_type":"xx" //请求源的终端平台类型，如"Android"、"iOS"、"Web"等
      "user_id":0L //用户ID，u64
      "auth_str":"xx" //通信认证密文串
      "new_mobile":"xx" //更换的新手机号码
      "sms_code":"xx" //新手机号码收到的短信验证码
    }
     */
    public String setUserMobile(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setUserMobile().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setUserMobile().getPf_type());
        map.put(InterfaceConstants.TEXT_USER_ID,setUser.setUserMobile().getUser_id());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.setUserMobile().getAuth_str());
        map.put(InterfaceConstants.TEXT_SMS_CODE,setUser.setUserMobile().getSms_code());
        map.put(InterfaceConstants.TEXT_NEW_MOBILE,setUser.setUserMobile().getNew_mobile());
        String json=JsonUtils.toJson(map);
        return json;
    }
}
