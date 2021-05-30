// program on get  and set method of arraylist using awt.

package src.com.mkpits.java.collection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.ArrayList;
import java.awt.*;

public class GetAndSetMethodUseAwtEx02 extends Frame{
    Label l1,l2;
    TextField t1,t2;
    TextArea ta;
    Button b1,b2,b3,b4;
    ArrayList<String> plist = new ArrayList<String>();
    GetAndSetMethodUseAwtEx02(){
        l1 = new Label("enter student name : ");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1 = new Button("Add Product");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plist.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2 = new Button("Display Product");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for(String str : plist){
                    sb.append("Product name :"+ str + "\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta = new TextArea("Product List");
        ta.setBounds(100,200,300,150);
        add(ta);

        l2 = new Label("Enter index number to view ");
        l2.setBounds(10,360,200,30);
        add(l2);
        t2 = new TextField();
        t2.setBounds(220,360,200,30);
        add(t2);
        b3 = new Button("get Method");
        b3.setBounds(100,400,150,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = plist.get(Integer.parseInt(t2.getText()));
                ta.setText("Product name at index "+ t2.getText() + ":"+ res);
            }
        });
        add(b3);

        b4 = new Button("set Method");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plist.set(Integer.parseInt(t2.getText()),t1.getText());
            }
        });
        add(b4);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args){
        new GetAndSetMethodUseAwtEx02();
    }
}
