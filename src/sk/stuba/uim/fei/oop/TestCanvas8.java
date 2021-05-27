package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestCanvas8 extends Canvas implements KeyListener {


    public TestCanvas8(){
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped zavolane  " + e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isActionKey()){
            System.out.println("keyPressed zavolane - ActionKey je " + e.getKeyCode());
        }
        else{
            System.out.println("keyPressed zavolane - something other je " + e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased zavolane - ActionKey je " + e.getKeyCode());
        System.out.println("-----------------------------------------------");
    }
}
