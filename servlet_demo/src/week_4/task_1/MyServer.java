package week_4.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shengyi
 * @create 2021/8/13 - 21:41
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket server = null;
        //设置服务器监听端口
        server = new ServerSocket(8066);
        //客户端
        Socket client = null;
        //输出流，向客户端发送消息
        PrintStream out = null;
        //缓存客户端传来的数据
        BufferedReader buf = null;
        //让服务器不断运行，始终能够接受来自客户端的连接请求
        while (true) {
            System.out.println("服务器运行中，等待连接...");
            client = server.accept();
            buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintStream(client.getOutputStream());
            boolean flag = true;
            while (flag) {
                String str = buf.readLine();
                if (str == null || str.equals("")) {
                    flag = false;
                }
                else {
                    if (str.equals("bye")) {
                        flag = false;
                    }
                    else {
                        out.println("来自客户端的输入：" + str);
                    }
                }
            }
            out.close();
            client.close();
        }
    }
}
