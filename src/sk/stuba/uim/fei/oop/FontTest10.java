package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontTest10 extends Frame implements ItemListener {

    Panel font_panel;
    Choice font_name;
    Choice font_type;
    Choice font_size;
    String[] fonts;
    String[] types = {"Plain", "Bold", "Italic", "Bold & Italic"};
    String[] sizes = {"10", "12", "14", "16", "18" ,"20"};

    String font_name_selected;
    int font_type_selected;
    int font_size_selected;

    public FontTest10(){

        super("Font Test");
        setLayout(new BorderLayout());
        setSize(500,400);

        fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        font_panel= new Panel();
        font_name = new Choice();
        font_type = new Choice();
        font_size = new Choice();

        font_name.addItemListener(this);
        font_type.addItemListener(this);
        font_size.addItemListener(this);

        for(int i=0;i<sizes.length;i++){
            font_size.add(sizes[i]);
        }
        for(int i=0;i<types.length;i++){
            font_type.add(types[i]);
        }
        for(int i=0;i<fonts.length;i++){
            font_name.add(fonts[i]);
        }

        font_name.select(0);
        font_name_selected = font_name.getSelectedItem();

        font_type.select(0);
        font_type_selected = font_type.getSelectedIndex();

        font_size.select(0);
        font_size_selected = Integer.parseInt(font_size.getSelectedItem());

        font_panel.add(font_name);
        font_panel.add(font_type);
        font_panel.add(font_size);

        add(BorderLayout.NORTH, font_panel);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == font_name){
            font_name_selected = font_name.getSelectedItem();
        }
        if(e.getSource() == font_type){
            font_type_selected = font_type.getSelectedIndex();
        }
        if(e.getSource() == font_size){
            font_size_selected = Integer.parseInt(font_size.getSelectedItem());
        }

        repaint();
    }
    public void paint(Graphics g){
        int x = 200;
        int y = 200;
        Font font  = new Font(font_name_selected, font_type_selected, font_size_selected);
        g.setFont(font);
        g.drawString(font_name_selected+ " " + types[font_type_selected] + "" + font_size_selected, x,y);

    }
}
