package com.zlz.test;

/**
 * Created by zzl on 2021-01-07.
 */
public class ShapeFactory {
    public Shape getShape(String type){
        if("shage1".equals(type)){
            return new Shage1();
        }else if("shage2".equals(type)){
            return new Shage2();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("shage1").draw();
        factory.getShape("shage2").draw();

    }


}
