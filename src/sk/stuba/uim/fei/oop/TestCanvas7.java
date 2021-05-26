package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class TestCanvas7 extends Canvas  {

    public HashSet<Rectangle> our_objects = new HashSet<Rectangle>();

    public void NewObjects(){
        int i=0;
        int j=20;
        while(i<5){
            our_objects.add(new Rectangle(10,j,20,20));
            j+=30;
            i++;
        }
    }

    public void paint(Graphics g){
        for(Rectangle arcRec : our_objects)
                g.drawRect(arcRec.x, arcRec.y, arcRec.width, arcRec.height);

    }

}
