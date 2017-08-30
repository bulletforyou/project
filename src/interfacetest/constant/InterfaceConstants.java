package interfacetest.constant;



public class InterfaceConstants {

    public static final String ENCODING_UTF8 = "UTF-8";

    // Auth
    public static final String CIPHER_AES = "AES";
    public static final String IV_SPEC_KEY = "7O0(B7#2T7F04f4p";
    public static final String CIPHER_AES_CFB_NOPADDING = "AES/CFB/NoPadding";
    /**
     * 密码前缀
     */
    public static final String CIPHER_PWD_PREFIX = "8!9HA3D6GB2A4mb2";
    /**
     * 密码后缀
     */
    public static final String CIPHER_PWD_SUFFIX = "9Cx8BB@A41B59658";
    /**
     * 对变换后密码进行aes加密的秘钥
     */
    public static final String CIPHER_PWD_KEY = "9FA0EC4F37A4437cA65F4C4D4BEE56D3";

    //	public static final long REQUEST_TIMEOUT = 10 * 60 * 1000;	// 请求过期时间: 10分钟, 以秒为单位
    public static final long REQUEST_TIMEOUT = 5 * 24 * 60 * 60 * 1000;
    public static final long SERVICE_TICKET_TIMEOUT = 7 * 24 * 60 * 60 * 1000; // 服务票据过期时间: 7天, 以秒为单位

    public static final int AUTH_KEY_LEN = 32;		// 随机字节数长度32
    public static final int AUTH_DATE_LEN = 14;		// 日期长度

    public static final String AUTH_SRCNAME_SEP = "/";	//srcType 和 登录名分隔符
    //身份认证相关key
    public static final String SP_KEY_SERVER_TICKET = "sp_key_server_ticket";//服务票据
    public static final String SP_KEY_LOCAL_PWD = "sp_key_local_pwd";//本地密码
    public static final String SP_KEY_LOGIN_NAME = "sp_key_login_name";//登录名
    public static final String SP_KEY_RANDOM_SECRET = "sp_key_random_secret";//随机秘钥
    public static final String SP_KEY_TRANSPORT_SECRET = "sp_key_transport_secret";//传输秘钥


    public static final String STRING_IP_ADDRESS="http://192.168.1.232";
    public static final String STRING_IP_PORT_80=":8080/";
    public static final String STRING_IP_PORT_9090=":9090/";




    //*****************************************************UPDATE接口*****************************************//
    public static final String STRING_UPDATE_CHECK_VER="hca/api/update/checkver";//检测前端版本
    public static final String STRING_UPDATE_GET_FILE="hca/api/update/getfile/<file_url_str>";//文件下载


    //*****************************************************AUTH接口*****************************************//
    public static final String STRING_GET_USER_BASIC_INFO ="hca/api/auth/getuserbasicinfo";//获取用户基本信息
    public static final String STRING_GET_SMS_CODE="hca/api/auth/getsmscode";//获取短信验证码
    public static final String STRING_ADD_USER="hca/api/auth/adduser";//添加用户
    public static final String STRING_REGISTER_USER="hca/api/auth/registeruser";//用户注册
    public static final String STRING_USER_LOGIN="hca/api/auth/userlogin";//认证登录
    public static final String STRING_GET_USER_INFO="hca/api/auth/getuserinfo";//获取用户信息
    public static final String STRING_SET_USER_INFO="hca/api/auth/setuserinfo";//修改用户信息


    public static final String STRING_RESET_USER_PASSWD="hca/api/auth/resetuserpasswd";//重置用户密码

    public static final String STRING_SET_USER_MOBILE="hca/api/auth/setusermobile";//修改用户手机号码


    //*****************************************************IM接口*****************************************//


    //*****************************************************BUSINESS共用接口*****************************************//

    public static final String STRING_LOGIN="hca/api/business/login";//服务登录


    public static final String STRING_UPLOAD_FILE=" hca/api/business/putfile/<user_id>/<auth_str>/<need_auth>";//文件上传
    public static final String STRING_DOWNLOAD_FILE="hca/api/business/getfile/<file_url_str>/<user_id>/<auth_str>";//文件下载

    public static final String STRING_GET_FAMILY_MEMBER_LIST="hca/api/business/getfamilymemberlist";// 获取家庭成员或个人基本信息
    public static final String STRING_GET_DOC_LIST="hca/api/business/getdoclist";//获取个人健康档案列表


    public static final String STRING_GET_BASE_TEST_RET="hca/api/business/getbasetestret";//获取基本检测结果数据


    public static final String STRING_SUBMIT_BASE_TEST_RET="hca/api/business/submitbasetestret";//提交基本检测结果数据

    public static final String STRING_GET_CIRCLE_LIST="hca/api/business/getcirclelist";//获取交流圈列表
    public static final String STRING_GET_CIRCLE_POST_LIST="hca/api/business/getcirclepostlist";//获取交流圈留言列表
    public static final String STRING_SUBMIT_CIRCLE_POST="hca/api/business/submitcirclepost";//发表交流圈留言

    public static final String STRING_DELETE_CIRCLE_POST="hca/api/business/delcirclepost";//删除交流圈留言

    public static final String STRING_GET_APPOREG_LIST="hca/api/business/getapporeglist";//获取预约挂号列表

    public static final String STRING_MOD_APPOREG="hca/api/business/modapporeg";//修改预约挂号

    public static final String STRING_GET_APPOIMMUNE_LIST="hca/api/business/getappoimmunelist";//获取计划免疫列表

    public static final String STRING_MOD_APPOIMMUNE="hca/api/business/modappoimmune";//修改计划免疫

    public static final String STRING_GET_AREA_LIST="hca/api/business/getarealist";// 获取下级行政区列表

    public static final String STRING_COMMENT="hca/api/business/comment";//意见反馈

    public static final String STRING_GET_PUSH_MSG="hca/api/business/getpushmsg";//获取内部推送消息



    //**********************************BUSINESS健教专干端接口**********************************//

    public static final String STRING_HECADRE_GET_TASK_SUM="hca/api/business/hecadre/gettasksum";//获取任务计划

    public static final String STRING_HECADRE_ADD_TASK="hca/api/business/hecadre/addtask";//添加任务计划

    public static final String STRING_HECADRE_GET_ACTIVITY_STATE="hca/api/business/hecadre/getactivitystate";//获取活动类型状态

    public static final String STRING_HECADRE_GET_NOTICE="hca/api/business/hecadre/getnotice";//获取通知消息

    public static final String STRING_HECADRE_GET_MEMO_LIST="hca/api/business/hecadre/getmemolist";//获取备忘列表

    public static final String STRING_HECADRE_MOD_MEMO="hca/api/business/hecadre/modmemo";//修改备忘
    public static final String STRING_HECADRE_GET_GRID="hca/api/business/hecadre/getgrid";//获取网格地图
    public static final String STRING_HECADRE_SUBMIT_GRID_STATE="hca/api/business/hecadre/submitgridstate";//提交网格建档状态

    public static final String STRING_HECADRE_ADD_TENEMENT="hca/api/business/hecadre/addtenement";//添加新住址
    public static final String STRING_HECADRE_MOD_FAMILY_MEMBER="hca/api/business/hecadre/modfamilymember";//修改家庭成员或个人基本信息

    public static final String STRING_HECADRE_MOVE_OUT_FAMILY_MEMBER="hca/api/business/hecadre/moveoutfamilymember";//家庭成员迁出

    public static final String STRING_HECADRE_MOVE_IN_FAMILY_MEMBER="hca/api/business/hecadre/moveinfamilymember";//家庭成员迁入

    public static final String STRING_HECADRE_GET_DOC_DIR="hca/api/business/hecadre/getdocdir";//获取健康档案目录

    public static final String STRING_HECADRE_GET_DOC_UI="hca/api/business/hecadre/getdocui";//获取健康档案界面

    public static final String STRING_HECADRE_SUBMIT_DOC="hca/api/business/hecadre/submitdoc";//提交居民健康档案

    public static final String STRING_HECADRE_SUBMIT_IMAGE_DOC="hca/api/business/hecadre/submitimagedoc";//提交居民健康影像档案

    public static final String STRING_HECADRE_GET_USER_CROWD="hca/api/business/hecadre/getusercrowd";//获取居民所属人群

    public static final String STRING_HECADRE_ADD_USER_CROWD="hca/api/business/hecadre/addusercrowd";//添加居民所属人群

    public static final String STRING_HECADRE_GET_ACTIVITY="hca/api/business/hecadre/getactivity";//获取活动信息

    public static final String STRING_HECADRE_START_ACTIVITY="hca/api/business/hecadre/startactivity";//发起活动

    public static final String STRING_HECADRE_ADD_ACTIVITY_USER="hca/api/business/hecadre/addactivityuser";//添加参加活动的人员

    public static final String STRING_HECADRE_GET_ACTIVITY_USER_STATE="hca/api/business/hecadre/getactivityuserstate";//获取活动中居民的状态

    public static final String STRING_HECADRE_SIGN_IN_ACTIVITY="hca/api/business/hecadre/signinactivity";//活动签到或登记

    public static final String STRING_HECADRE_SUBMIT_ACTIVITY_SUM="hca/api/business/hecadre/submitactivitysum";//提交活动总结

    public static final String STRING_HECADRE_GET_IN_HABITANT="hca/api/business/hecadre/getinhabitant";//获取所辖居民

    public static final String STRING_HECADRE_MOD_CIRCLE="hca/api/business/hecadre/modcircle";//修改交流圈

    public static final String STRING_HECADRE_GET_CONTRACT_LIST="hca/api/business/hecadre/getfdcontractlist";//获取家庭医生签约列表

    public static final String STRING_HECADRE_GET_CONTRACT="hca/api/business/hecadre/getfdcontract";//获取家庭医生签约信息

    public static final String STRING_HECADRE_MOD_CONTRACT="hca/api/business/hecadre/modfdcontract";//修改家庭医生签约信息


    //*************************************BUSINESS居民端接口*************************************//
    public static final String STRING_INHABITANT_GET_HOME_PIC="hca/api/business/inhabitant/gethomepic";//获取主页轮播图

    public static final String STRING_INHABITANT_GET_HOME_ARTICLE_LIST="hca/api/business/inhabitant/gethomearticlelist";// 获取主页文章列表

    public static final String STRING_INHABITANT_GET_COMPANY_LIST="hca/api/business/inhabitant/getcompanyinfo";// 获取主页文章列表

    public static final String STRING_INHABITANT_GET_NOTICE="hca/api/business/inhabitant/getnotice";//获取通知消息

    public static final String STRING_INHABITANT_REPLY_NOTICE="hca/api/business/inhabitant/replynotice";//获取通知消息

    public static final String STRING_INHABITANT_GET_ILLNESS_LIST="hca/api/business/inhabitant/getappohospitalillnesslist";//获取预约挂号医院、科室及常见病种列表

    public static final String STRING_INHABITANT_GET_HECADRE="hca/api/business/inhabitant/gethecadre";//获取对应健教专干

    public static final String STRING_INHABITANT_GET_FD_CONTRACT_STATE="hca/api/business/inhabitant/getfdcontractstate";// 获取家庭医生签约状态'

    public static final String STRING_INHABITANT_SIGN_FD_CONTRACT="hca/api/business/inhabitant/signfdcontract";//提交家庭医生签约申请

    public static final String STRING_INHABITANT_SUBMIT_TEST_RET="hca/api/business/inhabitant/submittestret";//提交测一测结果

    //************************************* LIS数据同步接口*************************************//

    public static final String STRING_INHABITANT_SUBMIT_TIOSS_LIST_RET="hca/api/business/hecadre/submitiosslisret";//提交库贝尔iOSS LIS检查结果数据




    //************************************* Constants*************************************//


    //------------------key
    public static final String TEXT_ANDROID="Android";
    public static final String TEXT_IOS="iOS";

    public static final String TEXT_HECADRE_APP="HECadre APP";

    public static final String TEXT_SRC_TYPE="src_type";

    public static final String TEXT_PF_TYPE="pf_type";

    public static final String TEXT_DEV_ID ="dev_id";

    public static final String TEXT_MOBILE ="mobile";

    public static final String TEXT_USER_ID="dev_id";

    public static final String TEXT_VER="ver";

    public static final String TEXT_VER_CODE="ver_code";

    public static final String TEXT_LOGIN_NAME="login_name";

    public static final String TEXT_AUTH_STR="auth_str";

    public static final String TEXT_PERSON_ID="person_id";

    public static final String TEXT_IS_REAL_NAME="is_real_name";

    public static final String TEXT_PASSWD_STR="passwd_str";

    public static final String TEXT_NAME="name";

    public static final String TEXT_EMAIL="email";

    public static final String TEXT_SEX="sex";

    public static final String TEXT_HEAD_PIC_URL="head_pic_url";

    public static final String TEXT_PERSON_ID_PIC_URL="person_id_pic_url";






    //------------------value

    public static final int NUMBER_ONE=1;
    public static final int NUMBER_TWO=2;
    public static final int NUMBER_ZERO=0;

    public static final String STRING_DEV_ID ="36c13a422422cbed";

    public static final String STRING_PASSWD="123456";

    public static final String STRING_USER_NAME ="admin";

    public static final long LONG_USERID=110223456789L;

    public static final String STRING_PERSON_ID ="610481195007048776";

    public static final String STRING_MOBILE ="13333333333";




}
