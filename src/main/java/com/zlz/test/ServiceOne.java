package com.zlz.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by zzl on 2021-01-14.
 */
public class ServiceOne{
    private ServerSocket serverSocket;

    public ServiceOne(int port) throws IOException {
        serverSocket = new ServerSocket(port);
//        serverSocket.setSoTimeout(10000);


    }

    public void run() {
        try {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + " Goodbye!");
                server.close();
        }catch(SocketTimeoutException s) {
            System.out.println("Socket timed out!");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args)
    {
        int port = 8080;
        try
        {
            ServiceOne t = new ServiceOne(port);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
