package sk.stuba.uim.fei.oop;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Closer7 extends WindowAdapter {
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
