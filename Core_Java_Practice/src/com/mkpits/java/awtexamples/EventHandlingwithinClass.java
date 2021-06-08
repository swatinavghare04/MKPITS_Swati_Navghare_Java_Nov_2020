// WAP in java of event handling within the class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;
public class EventHandlingwithinClass extends Frame implements ActionListener{
    TextField tf;
    EventHandlingwithinClass(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);

        Button b= new Button("Click");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            tf.setText("Welcome");
    }
    public static void main(String[] args){
   EventHandlingwithinClass ev = new  EventHandlingwithinClass();
    }
}
