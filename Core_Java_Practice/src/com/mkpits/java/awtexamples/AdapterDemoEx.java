package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class AdapterDemoEx extends Frame{
    AdapterDemoEx(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new AdapterDemoEx();
    }
}

class MyMouseAdapter extends MouseAdapter{
    AdapterDemoEx adapterdemo;
    public MyMouseAdapter(AdapterDemoEx adapterdemo){
        this.adapterdemo = adapterdemo;
    }
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouse clicked" + me.getX() +"," + me.getY());
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter{
    AdapterDemoEx adapterdemo;
    public MyMouseMotionAdapter(AdapterDemoEx adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    public void mouseDragged(MouseEvent me)
    {
        System.out.println("mouse dragged");
    }
}


