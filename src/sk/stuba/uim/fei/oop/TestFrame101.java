package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame101 extends JFrame {
    public TestFrame101(){
        final JFrame f = this;

        setSize(300,300);
        setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloseQuestion10 end = new CloseQuestion10(f);
                if(end.yes){
                  dispose();
                  System.exit(0);
                }
            }
        });
    }
}
