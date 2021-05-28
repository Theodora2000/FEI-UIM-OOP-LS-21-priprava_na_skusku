package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame10 extends Frame implements ActionListener {

    Panel button_panel;
    Button crosshair_c;
    Button wait_c;
    Button default_c;
    Button text_c;
    Button hand_c;

    Cursor panel_cursor;
    Cursor frame_cursor;

    public TestFrame10(){
        super("Cursor frame");
        setLayout(new BorderLayout());
        setSize(700,400);

        button_panel = new Panel();

        crosshair_c = new Button("CROSSHAIR_CURSOR");
        wait_c = new Button("WAIT_CURSOR");
        default_c = new Button("DEFAULT_CURSOR");
        text_c = new Button("TEXT_CURSOR");
        hand_c = new Button("HAND_CURSOR");

        crosshair_c.addActionListener(this);
        wait_c.addActionListener(this);
        default_c.addActionListener(this);
        text_c.addActionListener(this);
        hand_c.addActionListener(this);

        button_panel.add(crosshair_c);
        button_panel.add(wait_c);
        button_panel.add(default_c);
        button_panel.add(text_c);
        button_panel.add(hand_c);

        panel_cursor = new Cursor(Cursor.MOVE_CURSOR);
        frame_cursor = new Cursor(Cursor.WAIT_CURSOR);

        button_panel.setCursor(panel_cursor);
        this.setCursor(frame_cursor);

        add(BorderLayout.NORTH, button_panel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == crosshair_c){
            frame_cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == wait_c){
            frame_cursor = new Cursor(Cursor.WAIT_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == default_c){
            frame_cursor = new Cursor(Cursor.DEFAULT_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == text_c){
            frame_cursor = new Cursor(Cursor.TEXT_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == hand_c){
            frame_cursor = new Cursor(Cursor.HAND_CURSOR);
            this.setCursor(frame_cursor);
        }
    }
}
