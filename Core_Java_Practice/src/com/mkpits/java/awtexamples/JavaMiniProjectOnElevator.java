package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaMiniProjectOnElevator extends Frame{

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    Label l1, l2, l3,l4;
    Panel panel,panel1,panel2,panel3;

    JavaMiniProjectOnElevator() {

        panel = new Panel();
        panel.setBounds(20, 50, 120, 330);
        panel.setBackground(Color.LIGHT_GRAY);

        panel1 = new Panel();
        panel1.setBounds(30, 100, 100, 100);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        l4= new Label();
        l4.setBounds(30,20,100,100);
        panel1.add(l4);
        panel.add(panel1);

        panel2 = new Panel();
        panel2.setBounds(30, 250, 100, 100);
        panel2.setBackground(Color.white);
        panel2.setLayout(null);
        panel.add(panel2);

        panel3 = new Panel();
        panel3.setBounds(30, 370, 100, 100);
        panel3.setBackground(Color.white);
        panel3.setLayout(null);
        l1 = new Label("FAN ON/OFF");
        l1.setBounds(10, 10, 90, 30);
        panel3.add(l1);
        l2 = new Label("LIGHT ON/OFF");
        l2.setBounds(10, 30, 90, 30);
        panel3.add(l2);
        l3 = new Label("DOOR O / C");
        l3.setBounds(10, 50, 100, 30);
        panel3.add(l3);
        panel.add(panel3);
        add(panel);

        b1 = new Button("1");
        b1.setBounds(150, 50, 50, 50);
       // b1.addActionListener(this);
        add(b1);

        b2 = new Button("2");
        b2.setBounds(220, 50, 50, 50);
        //b2.addActionListener(this);
        add(b2);

        b3 = new Button("3");
        b3.setBounds(150, 120, 50, 50);
       // b3.addActionListener(this);
        add(b3);

        b4 = new Button("4");
        b4.setBounds(220, 120, 50, 50);
        //b4.addActionListener(this);
        add(b4);

        b5 = new Button("5");
        b5.setBounds(150, 190, 50, 50);
        //b5.addActionListener(this);
        add(b5);

        b6 = new Button("6");
        b6.setBounds(220, 190, 50, 50);
        //b6.addActionListener(this);
        add(b6);

        b7 = new Button("L");
        b7.setBounds(150, 260, 50, 50);
        //b7.addActionListener(this);
        add(b7);

        b8 = new Button("F");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = panel1.getText();
                if(f.equals("Fan off")){
                    panel1.setText("Fan on");
                }
                else{
                    panel1.setText("Fan off");
                }
            }
        });
        b8.setBounds(220, 260, 50, 50);
        panel3.add(b8);

        b9 = new Button("O");
        b9.setBounds(150, 330, 50, 50);
       // b9.addActionListener(this);
        add(b9);

        b10 = new Button("C");
        b10.setBounds(220, 330, 50, 50);
       // b10.addActionListener(this);
        add(b10);

        setSize(300, 450);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaMiniProjectOnElevator();
    }
}
