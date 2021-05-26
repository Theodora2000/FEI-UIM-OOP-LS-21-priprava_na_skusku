package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {

    int pocet = 0;
    public MyButton(String label){
        super(label);
        pocet = 0;
        addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pocet++;
        System.out.println(e.getActionCommand() + " " + pocet);
    }
}
