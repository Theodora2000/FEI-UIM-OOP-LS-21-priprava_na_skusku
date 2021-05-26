package sk.stuba.uim.fei.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPrinter implements ActionListener {

    int pocet = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
       pocet++;
        System.out.println(e.getActionCommand() + " " + pocet);
    }
}
