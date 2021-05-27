package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame8 extends JFrame implements ItemListener {

    JCheckBox one;
    JCheckBox two;
    JTextField in;

    public TestFrame8(){

        super("Test");

        setSize(500,400);
        setLayout(new BorderLayout());

        one = new JCheckBox("one", true);
        one.addItemListener(this);
        add(BorderLayout.NORTH,one);

        two = new JCheckBox("two", true);
        two.addItemListener(this);
        add(BorderLayout.CENTER,two);

        in = new JTextField();
        add(BorderLayout.SOUTH, in);
        in.setText("One is " +one.isSelected()+", two is "+two.isSelected()+".");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();

        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == one){
            in.setText("One was changed and is " +one.isSelected()+", two is "+two.isSelected()+".");
        }
        else if(e.getSource()  == two){
            in.setText("Two was changed and is " +two.isSelected()+", one is "+one.isSelected()+".");

        }
    }
}