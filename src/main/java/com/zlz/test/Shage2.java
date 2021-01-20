package com.zlz.test;

/**
 * Created by zzl on 2021-01-07.
 */
public class Shage2 extends Gatext implements Shape,One {
    @Override
    public void draw() {
        System.out.println("我是shage2");
    }

    @Override
    public void sayhallo() {

    }

    @Override
    public void add() {

    }

    public static void main(String[] args) {
        String str="Hello World wHe";
        String strr = new StringBuffer(str).reverse().toString();
        System.out.println(strr);
        System.out.println( str.replace( 'H','W' ) );
        System.out.println( str.replaceFirst("He", "Wa"));
        System.out.println( str.replaceAll("He", "Ha"));
//        String str = "Hello World";
//        String anotherString = "hello world";
//        Object objStr = str;
//        System.out.println(System.identityHashCode(str)+" , "+System.identityHashCode(anotherString)+" , "+System.identityHashCode(objStr));
//        System.out.println( str.compareTo(anotherString)+"     "+str.equals(anotherString) );
//        System.out.println( str.compareToIgnoreCase(anotherString) +"     "+str.equalsIgnoreCase(anotherString));  //忽略大小写
//        System.out.println( str.compareTo(objStr.toString()) +"     " + str.equals(objStr.toString()));
    }
}
