// WAP in java using Awt to demonstrate example of ToolKit Use Beep.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class AwtToolKitExUsebeep {
    public static void main(String[] args) {
        Frame f = new Frame("ToolkitExample");
        Button b = new Button("beep");
        b.setBounds(50, 100, 60, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }

}
