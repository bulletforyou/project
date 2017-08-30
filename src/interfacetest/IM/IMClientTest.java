package interfacetest.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import interfacetest.constant.InterfaceConstants;
import org.apache.logging.log4j.*;

public class IMClientTest {

    static String tag = Thread.currentThread().getClass().getName();

    private static final Logger Log = LogManager.getLogger();

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InterfaceConstants.STRING_IP_ADDRESS, Integer.valueOf(InterfaceConstants.STRING_IP_PORT_80));

//        Log.info(tag, "开始建立连接");
        //根据输入输出流和服务端连接
        String message="Message";
        byte[] strbyte=message.getBytes();
        int bytelength=strbyte.length;
        OutputStream outputStream = socket.getOutputStream();//获取一个输出流，向服务端发送信息
        PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
        printWriter.print("Message");//向服务端发送消息
        printWriter.flush();
        socket.setSoTimeout(500);
        socket.shutdownOutput();//关闭输出流

        InputStream inputStream = socket.getInputStream();//获取一个输入流，接收服务端的信息
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//包装成字符流，提高效率
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//缓冲区
        String info = "";
        String temp = null;//临时变量
        while ((temp = bufferedReader.readLine()) != null) {
            info += temp;
            System.out.println("客户端接收服务端发送信息：" + info);
        }
        //关闭相对应的资源
//        Log.info(tag, "关闭连接");
        bufferedReader.close();
        inputStream.close();
        printWriter.close();
        outputStream.close();
        socket.close();
    }
}
