package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main8 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(300,300);
        f.add(new TestCanvas8());
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
