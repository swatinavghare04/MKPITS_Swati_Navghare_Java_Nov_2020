// Simple example of AWT by Inheritance extends Frame class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class AwtByIheritance extends Frame {
    AwtByIheritance(){
        Button b = new Button("click me");
        b.setBounds(30,100,80,30);  // Setting button position
        add(b);  // adding button into frame
        setSize(300,300); // frame size 300 width and 300 height
        setLayout(null);
        setVisible(true);  // now frame will be visible
    }
    public static void main(String[] args){
        AwtByIheritance a = new AwtByIheritance();
    }
}

