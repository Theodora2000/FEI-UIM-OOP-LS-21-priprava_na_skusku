package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(300,300);
        JPanel p = new JPanel();
        JButton b1 = new JButton("OK");
        b1.addActionListener(new ButtonPrinter());
        p.add(b1);
        f.add(p);

        f.setVisible(true);
    }
}
