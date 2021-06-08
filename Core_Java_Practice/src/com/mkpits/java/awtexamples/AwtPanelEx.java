// WAP in java using Awt to demonstrate example of Panel.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtPanelEx extends Frame {

    AwtPanelEx() {
        Panel panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);

        Button b = new Button("Button 1");
        b.setBounds(50, 100, 80, 30);
        b.setBackground(Color.yellow);

        Button b1 = new Button("Button 2");
        b1.setBounds(100, 100, 80, 30);
        b1.setBackground(Color.green);
        panel.add(b);
        panel.add(b1);
        add(panel);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AwtPanelEx();
    }
}
