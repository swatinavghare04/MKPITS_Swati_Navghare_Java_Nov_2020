// WAP to demonstrate the arraylist using AWT.

package src.com.mkpits.java.collection;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.ArrayList;

public class ArrayListExUseAwt02 extends Frame {
    Label l1,l2;
    TextArea ta;
    TextField t1;
    Button b1,b2;
    ArrayList<String> plist = new ArrayList<String>();

    ArrayListExUseAwt02(){
        l1 = new Label("enter product name :");
        l1.setBounds(10,50,200,30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);

        b1= new Button("add product");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plist.add(t1.getText());
                t1.setText("");
            }
        });

        add(b1);
        b2 = new Button("display product");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for(String str : plist){
                   sb.append("product name : "+ str + "\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta = new TextArea("product list");
        ta.setBounds(100,200,300,150);
        add(ta);

        setLayout(null);
        setSize(700,500);
        setVisible(true);

    }
    public static void main(String[] args){
        new ArrayListExUseAwt02();
    }
}
