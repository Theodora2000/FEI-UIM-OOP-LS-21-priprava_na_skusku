package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleButton7 extends JButton implements ActionListener {

    public boolean wannaRect;

    public RectangleButton7(String label){
        super(label);
        addActionListener(this);
        wannaRect=false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I wanna square!");
        wannaRect = true;
    }
}
