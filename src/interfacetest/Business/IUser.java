package interfacetest.Business;

 public  interface IUser {


     String  getSms_code();

     void setSms_code(String sms_code) ;

     long[] getUser_id_get_list();

     void setUser_id_get_list(long[] user_id_get_list);



     String getSrc_type();

     void setSrc_type(String src_type);

     String getPf_type();

     void setPf_type(String pf_type);

     long getUser_id();

     void setUser_id(long user_id);

     String getAuth_str();

     void setAuth_str(String auth_str);

     String getLogin_name();

     void setLogin_name(String login_name);

     String getPerson_id();

     void setPerson_id(String person_id);

     int getIs_real_name();

     void setIs_real_name(int is_real_name);

     String getMobile();

     void setMobile(String mobile);

     String getPasswd_str();


     void setPasswd_str(String passwd_str);

     String getName();

     void setName(String name);

     String getEmail();

     void setEmail(String email);


     int getSex();

     void setSex(int sex);

     String getHead_pic_url();

     void setHead_pic_url(String head_pic_url);

     String getPerson_id_pic_url();

     void setPerson_id_pic_url(String person_id_pic_url);

     String getDev_id();

     void setDev_id(String dev_id);

     long getUser_id_mod();

     void setUser_id_mod(long user_id_mod);
     long[] getUser_id_get();

     void setUser_id_get(long[] user_id_get);

     String[] getPerson_id_get();

     void setPerson_id_get(String[] person_id_get);


     String[] getName_get();

     void setName_get(String[] name_get);

     String getVer() ;

     void setVer(String ver);

     long getVer_code();

     void setVer_code(long ver_code);

     int getSms_code_type();

     void setSms_code_type(int sms_code_type);

     String getLogin_auth_str();

     void setLogin_auth_str(String login_auth_str);

     long getTenement_id();

     void setTenement_id(long tenement_id);
}
