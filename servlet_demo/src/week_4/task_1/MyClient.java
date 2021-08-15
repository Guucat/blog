package week_4.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author shengyi
 * @create 2021/8/13 - 21:55
 */
public class MyClient {
    public static void main(String[] args) throws IOException {
        //客户端
        Socket client = null;
        //声明连接的主机和端口
        client = new Socket("localhost", 8066);
        //接受服务器返回端数据
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        //接收键盘输入的数据
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //输出流，向服务器端发送消息
        PrintStream out = new PrintStream(client.getOutputStream());
        //标志位，使客户端与服务器可以不断交互
        boolean flag = true;
        while (flag) {
            System.out.println("请输入数据：");
            String str = input.readLine();
            //向服务器发送数据
            out.println(str);
            //输入“bye"结束当前会话
            if (str.equals("bye")) {
                flag = false;
            } else {
                System.out.println(buf.readLine());
            }
        }

    }
}
