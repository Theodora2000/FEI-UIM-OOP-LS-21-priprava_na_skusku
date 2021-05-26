package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main5 {
    public static void main(String[] args){

        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.add(new Canvas5());
        Graphics g  = f.getGraphics();
        g.drawString("YES OR YES", 50, 50);


    }
}
