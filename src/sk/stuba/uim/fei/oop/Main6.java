package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(300,300);

        JPanel p = new JPanel();
        p.add(new MyButton("Click"));
        f.add(p);
        f.setVisible(true);
    }
}
