package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame implements ActionListener {

    String Close ="Close";

    public TestFrame(String nazov){
        super(nazov);
        setSize(300,300);
        JPanel p = new JPanel();
        JButton b = new JButton(Close);
        b.addActionListener(this);
        p.add(b);
        add(p);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(Close)){
            dispose();
            System.exit(0);
        }
    }
}
