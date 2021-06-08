// program on get  and set method of arraylist using awt.

package src.com.mkpits.java.collection;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SetAndGetMethodUseAwt extends Frame {
    Label l1, l2;
    TextField t1, t2;
    TextArea ta;
    Button b1, b2, b3, b4;
    ArrayList<String> student = new ArrayList<String>();

    public SetAndGetMethodUseAwt() {
        l1 = new Label("enter student name");
        l1.setBounds(10, 50, 200, 30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(220, 50, 200, 30);
        add(t1);
        b1 = new Button("add student");
        b1.setBounds(100, 150, 150, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2 = new Button("display student");
        b2.setBounds(260, 150, 150, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
            /*
            Iterator itr=student.iterator();
            while (itr.hasNext()) {
                sb.append("student name : " + itr.next() +"\n");
            }

             */
                for (String str : student) {
                    sb.append("student name : " + str + "\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta = new TextArea("student list");
        ta.setBounds(100, 200, 300, 150);
        add(ta);

        l2 = new Label("enter index no to view ");
        l2.setBounds(10, 360, 200, 30);
        add(l2);
        t2 = new TextField();
        t2.setBounds(220, 360, 200, 30);
        add(t2);
        b3 = new Button("get method");
        b3.setBounds(100, 400, 150, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = student.get(Integer.parseInt(t2.getText()));
                ta.setText("student name at index " + t2.getText() + " : " + res);
            }
        });
        add(b3);
        b4 = new Button("set method");
        b4.setBounds(260, 400, 150, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.set(Integer.parseInt(t2.getText()), t1.getText());
            }
        });
        add(b4);

        setLayout(null);
        setSize(500, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        SetAndGetMethodUseAwt arl = new SetAndGetMethodUseAwt();
    }

}
