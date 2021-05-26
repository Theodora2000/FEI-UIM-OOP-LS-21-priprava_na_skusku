package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestCanvas7 extends Canvas implements MouseMotionListener, MouseListener {

    public TestCanvas7(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    //stlaci a spusti na tom istom mieste
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
    }

    //vzdy ked sa mys stlaci
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e);
        System.out.println("MouseClicked na suradnice" + " (" +e.getX() + "," + e.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Som stlacena a hybem sa ("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Hybem sa ("+e.getX()+","+e.getY()+")");
    }
}
