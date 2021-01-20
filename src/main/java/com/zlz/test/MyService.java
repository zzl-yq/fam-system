package com.zlz.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zzl on 2021-01-15.
 */
public class MyService {
    private ServerSocket serverSocket;

    public MyService(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void run() throws IOException {
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println(dataInputStream.readUTF());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("你好，再见");
        socket.close();
    }

    public static void main(String[] args) {
        int port = 8080;
        try {
            MyService myService = new MyService(port);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
