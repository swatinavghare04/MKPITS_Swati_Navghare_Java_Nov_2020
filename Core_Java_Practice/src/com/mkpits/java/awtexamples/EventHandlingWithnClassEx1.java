package src.com.mkpits.java.awtexamples;
import java.awt.*;
import java.awt.event.*;
class EventHandlingwithinClassEx1 extends Frame implements ActionListener{
    TextField tf;
    Button b1,b2;
    EventHandlingwithinClassEx1(){
        tf = new TextField();
        tf.setBounds(10,50,200,50);

        b1= new Button("Click");
        b1.setBounds(20,150,100,50);
        b1.addActionListener(this);

        b2= new Button("Clear");
        b2.setBounds(120,150,100,50);
        b2.addActionListener(this);
        add(tf);
        add(b1);
        add(b2);

        setTitle("Event Example");
        setSize(250,250);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1) {
            tf.setText("Welcome");
        }
        if(e.getSource()==b2) {
            tf.setText("");
        }

    }
    public static void main(String[] args){
        EventHandlingwithinClassEx1 ev = new EventHandlingwithinClassEx1();
    }
}
