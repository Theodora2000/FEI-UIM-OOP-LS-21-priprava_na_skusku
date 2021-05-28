package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseQuestion10 extends JDialog implements ActionListener {

    public boolean yes = false;

    public CloseQuestion10(JFrame f){
        super(f,"Close", true);
        add(BorderLayout.NORTH, new Label("Really close?"));
        JPanel p = new JPanel();
        JButton b = new JButton("Yes");
        p.add(b);
        b.addActionListener(this);
        JButton b1 = new JButton("No");
        p.add(b1);
        b1.addActionListener(this);

        add(BorderLayout.SOUTH, p);
        pack();
        setLocation(f.getLocation().x+100, f.getLocation().y+100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Yes")){
            yes = true;
        }
        dispose();
    }
}
