package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class PanelExample02 {
    PanelExample02()
    {
        Frame f= new Frame("Panel Example");
        Panel panel=new Panel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);
        Button b1=new Button("Button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        Button b2=new Button("Button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        panel.add(b1); panel.add(b2);
        f.add(panel);

        Panel panel1=new Panel();
        panel1.setBounds(250,80,200,200);
        panel1.setBackground(Color.orange);
        Button b11=new Button("Button 11");
        b11.setBounds(50,100,80,30);
        b11.setBackground(Color.yellow);
        Button b21=new Button("Button 21");
        b21.setBounds(100,100,80,30);
        b21.setBackground(Color.green);
        panel1.add(b11); panel1.add(b21);
        f.add(panel1);


        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new PanelExample02();
    }

}
