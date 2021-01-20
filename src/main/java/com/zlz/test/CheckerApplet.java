package com.zlz.test;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by zzl on 2021-01-15.
 */
public class CheckerApplet extends Applet {

    int squareSize = 50;// 初始化默认大小
    public void init () {
        String squareSizeParam = getParameter ("squareSize");
        parseSquareSize (squareSizeParam);
        String colorParam = getParameter ("color");
        Color fg = parseColor (colorParam);
        setBackground (Color.black);
        setForeground (fg);
    }
    private void parseSquareSize (String param) {
        if (param == null) return;
        try {
            squareSize = Integer.parseInt (param);
        }catch (Exception e) {
            // 保留默认值
        }
    }
    private Color parseColor (String param) {

        return new Color(12);
    }
    public void paint (Graphics g) {}

}
