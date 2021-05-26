package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame6 extends JFrame implements ActionListener {

    String Close ="Close";
    String Novinka = "New";
    public static int pocet = 0;
    public static int umiestnenie = 10;


    public TestFrame6(String nazov){
        super(nazov);
        setSize(300,300);
        JPanel p = new JPanel();
        JButton b = new JButton(Close);
        b.addActionListener(this);

        JButton novy = new JButton(Novinka);
        novy.addActionListener(this);

        p.add(b);
        p.add(novy);
        add(p);
        setLocation(umiestnenie, umiestnenie);
        setVisible(true);
        pocet++;
        umiestnenie+=50;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(Close)){//getSource vrati cely objekt, ak adresa teho objekta ista ako adresa b, tak potom vykona
            if(pocet==1){
                System.exit(0);
            }else {
                dispose();
                pocet--;
            }
        }
        if(e.getActionCommand().equals(Novinka)){//getSource vrati cely objekt, ak adresa teho objekta ista ako adresa b, tak potom vykona
            new TestFrame6("New one");
        }
    }
}
