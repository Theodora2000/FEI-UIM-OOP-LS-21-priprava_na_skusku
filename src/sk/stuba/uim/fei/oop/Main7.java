package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class Main7 {
    public static void main(String args[]){
        JFrame f = new JFrame("Stvorce");
        f.setSize(400,400);
        TestCanvas7 Can = new TestCanvas7();
        Can.NewObjects();
        f.add(Can);
        f.setVisible(true);
    }
}
