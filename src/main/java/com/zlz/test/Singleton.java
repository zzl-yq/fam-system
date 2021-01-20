package com.zlz.test;

import com.zlz.model.CdUser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.*;

/**
 * 单例模式
 * Created by zzl on 2021-01-07.
 */
public class Singleton {
    //这种写法可以保证线程安全饿汉式
    private static Singleton singleton = new Singleton();

    //使用private 让外部不可实例化
    private Singleton() {
    }


    public static Singleton getSingleton() {
        //懒汉式，在使用时才初始化，此方式不是线程安全 要线程安全方法加synchronized
        /*if(singleton == null){
            singleton = new Singleton();
        }*/
        //双重判断
        /*if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }*/

        return singleton;
    }

    public static void main(String[] args) {



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","password");
            Statement statement= connection.createStatement();
            ResultSet set = statement.executeQuery("");
            while (set.next()){

            }
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        List<CdUser> list = new ArrayList<>();
//        CdUser cdUser1 = new CdUser();
//        cdUser1.setUserId("1");
//        cdUser1.setUserName("第一");
//        CdUser cdUser2 = new CdUser();
//        cdUser2.setUserId("2");
//        cdUser2.setUserName("第二");
//        list.add(cdUser1);
//        list.add(cdUser2);
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("dii");
        list1.addFirst("dier");
        list1.addLast("插入最后位置");
        System.out.println(list1);
//        Singleton singleton = new Singleton();
//        for(int i=0;i<4;i++){
//            System.out.println(Singleton.getSingleton());
//        }
//        Date date = new Date();
//        System.out.printf("%1$s %2$tB %2$td, %2$tY",
//                "Due date:", date);
//        System.out.println();
//        StringBuilder sb = new StringBuilder("是一个是");
//        sb.append("数据库");
//        sb.append(652);
//        System.out.println(sb);
//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
//        System.out.println(st);
       /* OutputStreamWriter writer = null;
        FileOutputStream fop = null;
        try {
            File file = new File("D:/tt.txt");
            fop = new FileOutputStream(file);
            writer = new OutputStreamWriter(fop, "UTF-8");
            writer.write("思考人生说明不是");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                fop.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/



    }
}
