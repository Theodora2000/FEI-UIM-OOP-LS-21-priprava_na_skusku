package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(0,2));//ked dame 0, tak to bude tolko riadkov kolko potrebujeme
        f.add(new JLabel("riadok 1, stlpec1"));
        f.add(new JLabel("riadok 1, stlpec2"));
        f.add(new JLabel("riadok 2, stlpec1"));
        f.add(new JLabel("riadok 2, stlpec2"));
        f.add(new JLabel("riadok 3, stlpec1"));
        f.pack();//spakuje to do najmensieho pekneho tvaru

        f.setVisible(true);
    }
}
