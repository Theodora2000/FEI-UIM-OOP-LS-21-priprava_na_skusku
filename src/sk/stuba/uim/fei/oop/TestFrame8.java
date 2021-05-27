package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame8 extends JFrame implements ItemListener {

    List zoznam;
    Choice rozbalovacie_volby;
    String polozky_pre_zoznam[]={"jablko", "hruska", "cersna","melon"};
    String polozky_pre_rozbalovac[]={"apple", "pear", "cherry","waterlemon"};

    public TestFrame8(){

        super("Test");

        setSize(500,400);
        setLayout(new BorderLayout());

        rozbalovacie_volby = new Choice();
        rozbalovacie_volby.addItemListener(this);

        zoznam = new List();
        zoznam.addItemListener(this);

        for(int i=0;i<polozky_pre_rozbalovac.length;i++){
            rozbalovacie_volby.add(polozky_pre_rozbalovac[i]);
        }

        for(int i=0;i<polozky_pre_zoznam.length;i++){
            zoznam.add(polozky_pre_zoznam[i]);
        }

        add(BorderLayout.CENTER, zoznam);
        add(BorderLayout.SOUTH, rozbalovacie_volby);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();

        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == rozbalovacie_volby){
            zoznam.select(rozbalovacie_volby.getSelectedIndex());
        }
        else if(e.getSource()  == zoznam){
            rozbalovacie_volby.select(zoznam.getSelectedIndex());
        }
    }
}
