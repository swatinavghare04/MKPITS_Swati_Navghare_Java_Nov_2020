// Simple example of AWT by association(by creating object of frame class).

package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class AwtByAssociation {
    AwtByAssociation(){
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(300,300);;
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        AwtByAssociation a = new AwtByAssociation();
    }
}
