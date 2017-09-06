package interfacetest.Business;

import okhttp3.OkHttpClient;
import okhttp3.MediaType;

import java.io.IOException;

import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Response;
import interfacetest.constant.InterfaceConstants;



public class HttpMethod {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    private static volatile HttpMethod instance=null;
    public static HttpMethod getInstance() {
        if (instance == null) {
            synchronized (HttpMethod.class) {
                if (instance == null) {
                    instance = new HttpMethod();
                }
            }
        }
        return instance;
    }



    public String post(String filename,String interfaceName) throws IOException {
        RequestBody body = RequestBody.create(JSON, filename);
        Request request = new Request.Builder()
                .url(InterfaceConstants.STRING_IP_ADDRESS + InterfaceConstants.STRING_IP_PORT_80 + interfaceName)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        String respStr=response.body().string();
//        System.out.println(respStr);
        return respStr;
    }

    public String get(String interfaceName) throws IOException {
        Request request = new Request.Builder()
                .url(InterfaceConstants.STRING_IP_ADDRESS + InterfaceConstants.STRING_IP_PORT_80 + interfaceName)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}











