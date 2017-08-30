package interfacetest.suite;

import interfacetest.Business.HttpMethod;

import java.io.IOException;

import interfacetest.constant.InterfaceConstants;
import interfacetest.constant.FileNameConstants;

import org.junit.*;
public class TestBusiness {
    static HttpMethod postExample=new HttpMethod();
    @Test
    //获取任务计划
    public  void testGetTaskSum() throws IOException {
        String respStr= postExample.post(FileNameConstants.GET_TASK_SUM,InterfaceConstants.STRING_HECADRE_GET_TASK_SUM);
        Assert.assertEquals(respStr,"{\"ret_code\": 1}");
    }
}
