package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class TestCanvas7 extends Canvas implements MouseListener {

    public RectangleButton7 gombik;
    public HashSet<Rectangle> our_objects = new HashSet<Rectangle>();

    public TestCanvas7(RectangleButton7 gombik){
        super();
        addMouseListener(this);
        this.gombik = gombik;
    }

    public void paint(Graphics g){
        for(Rectangle arcRec : our_objects)
                g.drawRect(arcRec.x, arcRec.y, arcRec.width, arcRec.height);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(gombik.wannaRect){
        our_objects.add(new Rectangle(e.getX(),e.getY(),20,20));
        repaint();
        gombik.wannaRect=false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
