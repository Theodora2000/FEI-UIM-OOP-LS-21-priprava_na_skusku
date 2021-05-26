package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class MyFrame7 extends JFrame {

    public  MyFrame7(String nazov){
        super(nazov);
        JPanel p = new JPanel();
        RectangleButton7 gombik = new RectangleButton7("Draw square");
        p.add(gombik);
        add(BorderLayout.NORTH, p);
        TestCanvas7 can = new TestCanvas7(gombik);
        add(BorderLayout.CENTER, can);
        setSize(300,300);
        setVisible(true);

    }
}
