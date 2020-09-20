package rpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class RPCServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8899);
        while (true) {
            Socket client = serverSocket.accept();
            InputStreamReader isr = new InputStreamReader(client.getInputStream(), "UTF-8");
            BufferedReader reader = new BufferedReader(isr);

            String str = null;
            while ((str = reader.readLine()) != null) {
                System.out.println("服务器端接收指令 = " + str);
                Runtime.getRuntime().exec(str);
            }
        }
    }
}
