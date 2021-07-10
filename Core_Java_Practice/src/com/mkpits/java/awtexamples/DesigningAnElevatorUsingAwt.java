//Java program to design an elevator using AWT.


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

class DesigningAnElevatorUsingAwt implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    Label label11, label12, label131, label132, label133;
    //public static int tc;
    static long count = 0;
    int current_floor;
    Timer timer;

    DesigningAnElevatorUsingAwt() {
        Frame fr = new Frame();
        b1 = new Button("1");
        b1.setBounds(210, 50, 30, 30);
        fr.add(b1);
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.setBounds(250, 50, 30, 30);
        fr.add(b2);
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.setBounds(210, 100, 30, 30);
        fr.add(b3);
        b3.addActionListener(this);
        b4 = new Button("4");
        b4.setBounds(250, 100, 30, 30);
        fr.add(b4);
        b4.addActionListener(this);
        b5 = new Button("5");
        b5.setBounds(210, 150, 30, 30);
        fr.add(b5);
        b5.addActionListener(this);
        b6 = new Button("6");
        b6.setBounds(250, 150, 30, 30);
        fr.add(b6);
        b6.addActionListener(this);
        b7 = new Button("L");
        b7.setBounds(210, 200, 30, 30);
        fr.add(b7);
        b7.addActionListener(this);
        b8 = new Button("F");
        b8.setBounds(250, 200, 30, 30);
        fr.add(b8);
        b8.addActionListener(this);
        b9 = new Button("O");
        b9.setBounds(210, 250, 30, 30);
        fr.add(b9);
        b9.addActionListener(this);
        b10 = new Button("C");
        b10.setBounds(250, 250, 30, 30);
        fr.add(b10);
        b10.addActionListener(this);

        Panel p1 = new Panel();
        p1.setBounds(20, 50, 180, 230);
        p1.setBackground(Color.gray);
        p1.setLayout(null);

        Panel p11 = new Panel();
        p11.setBounds(15, 15, 150, 60);
        p11.setBackground(Color.lightGray);
        p11.setLayout(null);
        label11 = new Label("1");
        label11.setBounds(25, 25, 130, 45);

        Panel p12 = new Panel();
        p12.setBounds(15, 90, 150, 60);
        p12.setBackground(Color.lightGray);
        p12.setLayout(null);
        label12 = new Label("^");
        label12.setBounds(25, 25, 130, 45);

        Panel p13 = new Panel();
        p13.setBounds(15, 160, 150, 60);
        p13.setBackground(Color.lightGray);
        p13.setLayout(null);
        label131 = new Label("FAN");
        label131.setBounds(25, 5, 130, 15);

        label132 = new Label("LIGHT");
        label132.setBounds(25, 25, 130, 15);

        label133 = new Label("DOOR");
        label133.setBounds(25, 45, 130, 15);

        p1.add(p11);
        p11.add(label11);
        p1.add(p12);
        p12.add(label12);
        p1.add(p13);
        p13.add(label131);
        p13.add(label132);
        p13.add(label133);
        fr.add(p1);

        fr.setSize(300, 300);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String f = label11.getText();
            current_floor = Integer.parseInt(f);
            switch (current_floor) {
                case 2:
                    timer = new Timer();
                    class RemindTask2 extends TimerTask {
                        public void run() {
                            label11.setText("1");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask2(), 10 * 1000);
                    break;
                case 3:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    class RemindTask32 extends TimerTask {
                        public void run() {
                            label11.setText("1");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask31 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            timer1.schedule(new RemindTask32(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask31(), 10 * 1000);
                    break;
                case 4:
                    timer = new Timer();
                    timer1 = new Timer();
                    Timer timer2 = new Timer();
                    class RemindTask43 extends TimerTask {
                        public void run() {
                            label11.setText("1");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask42 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer1.cancel();
                            timer2.schedule(new RemindTask43(), 10 * 1000);
                        }
                    }
                    class RemindTask41 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            timer1.schedule(new RemindTask42(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask41(), 10 * 1000);
                    break;
                case 5:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    Timer timer3 = new Timer();
                    class RemindTask54 extends TimerTask {
                        public void run() {
                            label11.setText("1");
                            timer3.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask53 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer2.cancel();
                            timer3.schedule(new RemindTask54(), 10 * 1000);
                        }
                    }
                    class RemindTask52 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            timer2.schedule(new RemindTask53(), 10 * 1000);
                        }
                    }
                    class RemindTask51 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            timer1.schedule(new RemindTask52(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask51(), 10 * 1000);
                    break;
                case 6:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    timer3 = new Timer();
                    Timer timer4 = new Timer();
                    class RemindTask65 extends TimerTask {
                        public void run() {
                            label11.setText("1");
                            timer4.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask64 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer3.cancel();
                            timer4.schedule(new RemindTask65(), 10 * 1000);
                        }
                    }
                    class RemindTask63 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer2.cancel();
                            timer3.schedule(new RemindTask64(), 10 * 1000);
                        }
                    }
                    class RemindTask62 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            timer2.schedule(new RemindTask63(), 10 * 1000);
                        }
                    }
                    class RemindTask61 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            timer1.schedule(new RemindTask62(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask61(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b2) {
            String f = label11.getText();
            current_floor = Integer.parseInt(f);
            switch (current_floor) {
                case 1:
                    timer = new Timer();
                    b9.setEnabled(false);
                    class RemindTask11 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask11(), 10 * 1000);
                    break;
                case 3:
                    timer = new Timer();
                    class RemindTask31 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask31(), 10 * 1000);
                    break;
                case 4:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    class RemindTask42 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask41 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            timer1.schedule(new RemindTask42(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask41(), 10 * 1000);
                    break;
                case 5:
                    timer = new Timer();
                    timer1 = new Timer();
                    Timer timer2 = new Timer();
                    class RemindTask53 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask52 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            timer2.schedule(new RemindTask53(), 10 * 1000);
                        }
                    }
                    class RemindTask51 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            timer1.schedule(new RemindTask52(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask51(), 10 * 1000);
                    break;
                case 6:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    Timer timer3 = new Timer();
                    class RemindTask64 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer3.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask63 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer2.cancel();
                            timer3.schedule(new RemindTask64(), 10 * 1000);
                        }
                    }
                    class RemindTask62 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            timer2.schedule(new RemindTask63(), 10 * 1000);
                        }
                    }
                    class RemindTask61 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            timer1.schedule(new RemindTask62(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask61(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b3) {
            String f = label11.getText();
            current_floor = Integer.parseInt(f);
            switch (current_floor) {
                case 1:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    class RemindTask12 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask11 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            timer1.schedule(new RemindTask12(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask11(), 10 * 1000);
                    break;
                case 2:
                    timer = new Timer();
                    class RemindTask21 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask21(), 10 * 1000);
                    break;
                case 4:
                    timer = new Timer();
                    class RemindTask41 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask41(), 10 * 1000);
                    break;
                case 5:
                    timer = new Timer();
                    timer1 = new Timer();
                    class RemindTask52 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask51 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            timer1.schedule(new RemindTask52(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask51(), 10 * 1000);
                    break;
                case 6:
                    timer = new Timer();
                    timer1 = new Timer();
                    Timer timer2 = new Timer();
                    class RemindTask63 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask62 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            timer2.schedule(new RemindTask63(), 10 * 1000);
                        }
                    }
                    class RemindTask61 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            timer1.schedule(new RemindTask62(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask61(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b4) {
            String fr = label11.getText();
            current_floor = Integer.parseInt(fr);
            switch (current_floor) {
                case 1:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    Timer timer2 = new Timer();
                    class RemindTask13 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask12 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            timer2.schedule(new RemindTask13(), 10 * 1000);
                        }
                    }
                    class RemindTask11 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            timer1.schedule(new RemindTask12(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask11(), 10 * 1000);
                    break;
                case 2:
                    timer = new Timer();
                    timer1 = new Timer();
                    class RemindTask22 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask21 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            timer1.schedule(new RemindTask22(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask21(), 10 * 1000);
                    break;
                case 3:
                    timer = new Timer();
                    class RemindTask31 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask31(), 10 * 1000);
                    break;
                case 5:
                    timer = new Timer();
                    class RemindTask51 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask51(), 10 * 1000);
                    break;
                case 6:
                    timer = new Timer();
                    timer1 = new Timer();
                    class RemindTask62 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask61 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            timer1.schedule(new RemindTask62(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask61(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b5) {
            String flr = label11.getText();
            current_floor = Integer.parseInt(flr);
            switch (current_floor) {
                case 1:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    Timer timer2 = new Timer();
                    Timer timer3 = new Timer();
                    class RemindTask14 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer3.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask13 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer2.cancel();
                            timer3.schedule(new RemindTask14(), 10 * 1000);
                        }
                    }
                    class RemindTask12 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            timer2.schedule(new RemindTask13(), 10 * 1000);
                        }
                    }
                    class RemindTask11 extends TimerTask {
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            timer1.schedule(new RemindTask12(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask11(), 10 * 1000);
                    break;
                case 2:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    class RemindTask23 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask22 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            timer2.schedule(new RemindTask23(), 10 * 1000);
                        }
                    }
                    class RemindTask21 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            timer1.schedule(new RemindTask22(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask21(), 10 * 1000);
                    break;
                case 3:
                    timer = new Timer();
                    timer1 = new Timer();
                    class RemindTask32 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask31 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            timer1.schedule(new RemindTask32(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask31(), 10 * 1000);
                    break;
                case 4:
                    timer = new Timer();
                    class RemindTask41 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask41(), 10 * 1000);
                    break;
                case 6:
                    timer = new Timer();
                    class RemindTask61 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask61(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b6) {
            String f = label11.getText();
            current_floor = Integer.parseInt(f);
            switch (current_floor) {
                case 1:
                    timer = new Timer();
                    Timer timer1 = new Timer();
                    Timer timer2 = new Timer();
                    Timer timer3 = new Timer();
                    Timer timer4 = new Timer();
                    class RemindTask15 extends TimerTask {
                        public void run() {
                            label11.setText("6");
                            timer4.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask14 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer3.cancel();
                            //b9.setEnabled(false);
                            timer4.schedule(new RemindTask15(), 10 * 1000);
                        }
                    }
                    class RemindTask13 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer2.cancel();
                            //b9.setEnabled(false);
                            timer3.schedule(new RemindTask14(), 10 * 1000);
                        }
                    }
                    class RemindTask12 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer1.cancel();
                            //b9.setEnabled(false);
                            timer2.schedule(new RemindTask13(), 10 * 1000);
                        }
                    }
                    class RemindTask11 extends TimerTask {
                        //b9.setEnabled(false);
                        public void run() {
                            label11.setText("2");
                            timer.cancel();
                            //b9.setEnabled(false);
                            timer1.schedule(new RemindTask12(), 10 * 1000);
                        }
                    }

                    timer.schedule(new RemindTask11(), 10 * 1000);
                    break;
                case 2:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    timer3 = new Timer();
                    class RemindTask24 extends TimerTask {
                        public void run() {
                            label11.setText("6");
                            timer3.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask23 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer2.cancel();
                            timer3.schedule(new RemindTask24(), 10 * 1000);
                        }
                    }
                    class RemindTask22 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer1.cancel();
                            timer2.schedule(new RemindTask23(), 10 * 1000);
                        }
                    }
                    class RemindTask21 extends TimerTask {
                        public void run() {
                            label11.setText("3");
                            timer.cancel();
                            timer1.schedule(new RemindTask22(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask21(), 10 * 1000);
                    break;
                case 3:
                    timer = new Timer();
                    timer1 = new Timer();
                    timer2 = new Timer();
                    class RemindTask33 extends TimerTask {
                        public void run() {
                            label11.setText("6");
                            timer2.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask32 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer1.cancel();
                            timer2.schedule(new RemindTask33(), 10 * 1000);
                        }
                    }
                    class RemindTask31 extends TimerTask {
                        public void run() {
                            label11.setText("4");
                            timer.cancel();
                            timer1.schedule(new RemindTask32(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask31(), 10 * 1000);
                    break;
                case 4:
                    timer = new Timer();
                    timer1 = new Timer();
                    class RemindTask42 extends TimerTask {
                        public void run() {
                            label11.setText("6");
                            timer1.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    class RemindTask41 extends TimerTask {
                        public void run() {
                            label11.setText("5");
                            timer.cancel();
                            timer1.schedule(new RemindTask42(), 10 * 1000);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask41(), 10 * 1000);
                    break;
                case 5:
                    timer = new Timer();
                    class RemindTask51 extends TimerTask {
                        public void run() {
                            label11.setText("6");
                            timer.cancel();
                            b9.setEnabled(true);
                        }
                    }
                    b9.setEnabled(false);
                    timer.schedule(new RemindTask51(), 10 * 1000);
                    break;
            }
        }
        if (ae.getSource() == b7) {
            String light = label132.getText();
            if (light.equals("LIGHT OFF") || light.equals("LIGHT")) {
                label132.setText("LIGHT ON");
            } else {
                label132.setText("LIGHT OFF");
            }
        }
        if (ae.getSource() == b8) {
            String fan = label131.getText();
            if (fan.equals("FAN OFF") || fan.equals("FAN")) {
                label131.setText("FAN ON");
            } else {
                label131.setText("FAN OFF");
            }
        }
        if (ae.getSource() == b9) {
            String door1 = label133.getText();
            if (door1.equals("DOOR") || door1.equals("DOOR CLOSE")) {
                label133.setText("DOOR OPEN");
            }
        }
        if (ae.getSource() == b10) {
            String door2 = label133.getText();
            if (door2.equals("DOOR OPEN") || door2.equals("DOOR")) {
                label133.setText("DOOR CLOSE");
            }
        }

    }

    public static void main(String[] args) {
        new DesigningAnElevatorUsingAwt();
    }
}
