package interfacetest.suite;

import interfacetest.Business.CreateUser;
import interfacetest.Business.HttpMethod;


import java.io.IOException;

import interfacetest.constant.InterfaceConstants;
import interfacetest.systemutils.JsonUtils;
import org.junit.*;


public class TestAuth {
    static HttpMethod method = HttpMethod.getInstance();
    CreateUser createUser=new CreateUser();


//    @Before
//
//    @BeforeClass
//
//    @After
//
//    @AfterClass


    @Test
    //检测前端版本
    public  void testCheckVer() throws IOException {

       String respStr= method.post(createUser.getCheckver(),InterfaceConstants.STRING_UPDATE_CHECK_VER);
       Assert.assertTrue(respStr.contains("\"new_ver_code\":104"));
       Assert.assertTrue(respStr.contains("\"ret_code\":1"));
//       System.out.println(JsonUtils.toJson(respStr));
    }
    @Test
    //获取用户基本信息
    public  void testGetUserBasicInfo() throws IOException {
            String respStr = method.post(createUser.getUserbasicinfo(), InterfaceConstants.STRING_GET_USER_BASIC_INFO);
            System.out.println(respStr);
            Assert.assertTrue(respStr.contains("袁成"));
            Assert.assertTrue(respStr.contains("\"ret_code\":1"));
    }
    @Test
    //获取短信验证码
    public  void testGetSMSCode() throws IOException {
            String respStr= method.post(createUser.getSmscode(),InterfaceConstants.STRING_GET_SMS_CODE);
            System.out.println(respStr);
            Assert.assertTrue(respStr.contains("\"ret_code\": 1"));
    }

    @Test
    //添加用户
    public  void testAddUser() throws IOException {
        String respStr= method.post(createUser.getAdduser(),InterfaceConstants.STRING_ADD_USER);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

    @Test
    //用户注册
    public  void testRegisterUser()throws IOException {
        String respStr= method.post(createUser.getRegisterUser(),InterfaceConstants.STRING_REGISTER_USER);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

    @Test
    //用户注册
    public  void testUserLogin()throws IOException {
        String respStr= method.post(createUser.getUserLogin(),InterfaceConstants.STRING_USER_LOGIN);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

    @Test
    //获取用户信息
    public  void testGetUserInfo()throws IOException {
        String respStr= method.post(createUser.getUserInfo(),InterfaceConstants.STRING_GET_USER_INFO);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

    @Test
    //修改用户信息
    public  void testSetUserInfo()throws IOException {
        String respStr= method.post(createUser.setUserInfo(),InterfaceConstants.STRING_SET_USER_INFO);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

    @Test
    //修改用户信息
    public  void testResetUserPasswd()throws IOException {
        String respStr= method.post(createUser.resetUserPasswd(),InterfaceConstants.STRING_RESET_USER_PASSWD);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }
    @Test
    //修改用户手机
    public  void testSetUserMobile()throws IOException {
        String respStr= method.post(createUser.setUserMobile(),InterfaceConstants.STRING_SET_USER_MOBILE);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }

}
