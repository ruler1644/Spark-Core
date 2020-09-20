package rpc;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//客户端
public class RPCClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8899);
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
        PrintWriter pw = new PrintWriter(osw);

        //打开记事本
        pw.println("cmd /c notepad");
        pw.flush();
        System.out.println("客户端发送指令成功");
        socket.close();
    }
}
