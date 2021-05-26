package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setLayout(new BorderLayout());
        f.add(BorderLayout.CENTER,new Canvas5());
        JPanel p = new JPanel();
        p.add(new JButton("Change"));
        p.add(new JButton("Close"));
        f.add(BorderLayout.SOUTH, p);//juh
        f.setVisible(true);
    }
}
