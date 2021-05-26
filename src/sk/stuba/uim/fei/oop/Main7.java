package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class Main7 {
    public static void main(String args[]){
        JFrame f = new JFrame("Udalost mysi");
        f.setSize(400,400);
        f.add(new TestCanvas7());
        f.setVisible(true);
    }
}
