package interfacetest.suite;

import interfacetest.Business.CreateUser;
import interfacetest.Business.HttpMethod;


import java.io.IOException;

import interfacetest.cipher.CipherServiceImpl;
import interfacetest.constant.InterfaceConstants;
import interfacetest.constant.FileNameConstants;
import interfacetest.systemutils.*;
import org.junit.*;


public class TestAuth {
    static HttpMethod postExample = HttpMethod.getInstance();
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

       String respStr= postExample.post(createUser.getcheckver(),InterfaceConstants.STRING_UPDATE_CHECK_VER);
       Assert.assertTrue(respStr.contains("\"new_ver_code\":104"));
       Assert.assertTrue(respStr.contains("\"ret_code\":1"));
       System.out.println(respStr);

    }

    @Test
    //获取用户基本信息
    public  void testGetUserBasicInfo() throws IOException {
            String respStr = postExample.post(createUser.getuserbasicinfo(), InterfaceConstants.STRING_GET_USER_BASIC_INFO);
            System.out.println(respStr);
            Assert.assertTrue(respStr.contains("袁成"));
            Assert.assertTrue(respStr.contains("\"ret_code\":1"));


    }

    @Test
    //获取短信验证码
    public  void testGetSMSCode() throws IOException {
        String respStr= postExample.post(createUser.getsmscode(),InterfaceConstants.STRING_GET_SMS_CODE);
        System.out.println(respStr);
        Assert.assertTrue(respStr.contains("\"ret_code\":1"));

    }

    @Test
    //添加用户
    public  void testAddUser() throws IOException {
        String respStr= postExample.post(createUser.getadduser(),InterfaceConstants.STRING_ADD_USER);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");



    }


}
