package com.zlz.test;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by zzl on 2021-01-14.
 */
public class HelloWorldApplet extends Applet {
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }

    public void init(){

    }
}
