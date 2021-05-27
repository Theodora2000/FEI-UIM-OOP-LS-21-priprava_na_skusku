package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame81 extends JFrame implements ActionListener {

    JRadioButtonMenuItem ignore;
    PopupMenu pm;

    public TestFrame81(){

        JMenuBar m = new JMenuBar();
        setJMenuBar(m);

        JMenu test = new JMenu("Zatvarac okna");
        m.add(test);

        JMenuItem item = new JMenuItem("Close");
        item.addActionListener(this);
        test.add(item);

        ignore = new JRadioButtonMenuItem("Do not close");
        test.add(ignore);
        ignore.setSelected(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400,400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Close") && !ignore.isSelected()){
            System.exit(0);
        }
    }
}
