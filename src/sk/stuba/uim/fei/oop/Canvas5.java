package sk.stuba.uim.fei.oop;

import java.awt.*;

public class Canvas5 extends Canvas {

    public void paint(Graphics g){

        Dimension d = getSize();
        int w = d.width;
        int h = d.height;

        g.drawLine(1,1,w-1,h-1);
        g.drawLine(1,h-1,w-1,0);
        g.drawRect(1,1,w-1,h-1);

    }
}
