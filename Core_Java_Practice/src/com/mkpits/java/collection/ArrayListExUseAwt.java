// WAP to demonstrate Array list using AWT.

package src.com.mkpits.java.collection;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.ArrayList;

public class ArrayListExUseAwt extends Frame{
    Label l1,l2;
    TextField t1;
    TextArea ta;
    Button b1,b2;
    ArrayList<String> stud = new ArrayList<String>();
    ArrayListExUseAwt(){
        l1 = new Label("Enter student name");
        l1.setBounds(10,50,200,30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);

        b1 = new Button("add student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stud.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);

        b2 = new Button("display student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for(String str : stud){
                    sb.append("student name :" + str + "\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta = new TextArea("student list");
        ta.setBounds(100,200,300,150);
        add(ta);
        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }
    public static void main(String[] args){
        new ArrayListExUseAwt();
    }

}
