package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(300,300);

        JPanel p = new JPanel();
        MyButton b1 = new MyButton("Click");
        p.add(b1);
        JButton iny = new JButton("Click right");
        iny.addActionListener(b1);
        p.add(iny);
        f.add(p);
        f.setVisible(true);
    }
}
