// WAP in java to demonstrate how to use scrollbar in the program.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class ScrollBarExample {
    ScrollBarExample(){
        Frame f = new Frame("Scrollbar Example");
        Scrollbar sb = new Scrollbar();
        sb.setBounds(100,100,50,100);
        f.add(sb);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new ScrollBarExample();
    }
}
