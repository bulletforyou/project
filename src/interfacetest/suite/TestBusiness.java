package interfacetest.suite;

import interfacetest.Business.CreateUser;
import interfacetest.Business.HttpMethod;

import java.io.IOException;

import interfacetest.constant.InterfaceConstants;
import interfacetest.constant.FileNameConstants;

import org.junit.*;
public class TestBusiness {
    static HttpMethod method = HttpMethod.getInstance();
    CreateUser createUser=new CreateUser();

    @Test
    //获取任务计划
    public  void testGetTaskSum() throws IOException {
        String respStr= method.post(FileNameConstants.GET_TASK_SUM,InterfaceConstants.STRING_HECADRE_GET_TASK_SUM);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }
}
