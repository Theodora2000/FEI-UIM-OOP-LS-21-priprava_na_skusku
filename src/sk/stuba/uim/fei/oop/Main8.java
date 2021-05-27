package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main8 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        ScrollPane ms = new ScrollPane();
        MyCanvas8 papier = new MyCanvas8();
        papier.setSize(500,500);
        ms.add(papier);
        f.add(ms);
        f.setSize(300,300);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);

    }
}
