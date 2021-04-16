// WAP in java using AWT to demonstrate example on Keyboard event with adapter.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class KeyboardEventExWithAdapter extends Frame {
    TextField tf;
    public KeyboardEventExWithAdapter()
    {
        Label l=new Label("enter characters");
        l.setBounds(10,30,100,30);
        add(l);
        tf=new TextField(20);

        tf.setBounds(120,30,100,30);
        tf. addKeyListener(new mykeyadapter(this) );
        add(tf);


        // addMouseMotionListener(new  MyMouseMotionAdapter(this));
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] arg)
    {
        KeyboardEventExWithAdapter ad=new KeyboardEventExWithAdapter();
    }
}
class mykeyadapter extends KeyAdapter
{
    KeyboardEventExWithAdapter adapterdemo;
    public mykeyadapter(KeyboardEventExWithAdapter adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouseclicked event
    public void keyTyped(KeyEvent e)
    {
        System.out.println(" clicked");
    }
}

