package interfacetest.Business;
import interfacetest.constant.InterfaceConstants;

import java.util.HashMap;
import java.util.Map;

import interfacetest.systemutils.JsonUtils;

public class CreateUser {
    User user;
    SetUser setUser=new SetUser();
    Map map=new HashMap<>();
    public String getsmscode(){
            map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setsmscode().getSrc_type());
            map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setsmscode().getPf_type());
            map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setsmscode().getSms_code_type());
            map.put(InterfaceConstants.TEXT_MOBILE,setUser.setsmscode().getMobile());
            String json= JsonUtils.toJson(map);
            return json;

    }

    public String getuserbasicinfo(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setuserbasicinfo().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setuserbasicinfo().getPf_type());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setuserbasicinfo().getDev_id());
        String json=JsonUtils.toJson(map);
        return json;
    }

    public String getcheckver(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setcheckver().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setcheckver().getPf_type());
        map.put(InterfaceConstants.TEXT_DEV_ID,setUser.setcheckver().getDev_id());
        map.put(InterfaceConstants.TEXT_VER,setUser.setcheckver().getVer());
        map.put(InterfaceConstants.TEXT_VER_CODE,setUser.setcheckver().getVer_code());
        String json=JsonUtils.toJson(map);
        return json;
    }

    public String getadduser(){
        map.put(InterfaceConstants.TEXT_SRC_TYPE,setUser.setAddUser().getSrc_type());
        map.put(InterfaceConstants.TEXT_PF_TYPE,setUser.setAddUser().getPf_type());
        map.put(InterfaceConstants.TEXT_USER_ID,setUser.setAddUser().getUser_id());
        map.put(InterfaceConstants.TEXT_AUTH_STR,setUser.setAddUser().getAuth_str());
        map.put(InterfaceConstants.TEXT_LOGIN_NAME,setUser.setAddUser().getLogin_name());
        map.put(InterfaceConstants.TEXT_VER_CODE,setUser.setAddUser().getVer_code());


        String json=JsonUtils.toJson(map);
        return json;
    }
}
