package src.com.mkpits.java.awtexamples;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class ElevatorProject extends JLabel {
    private static final long serialVersionUID = 1L;

    private static final int BLINKING_RATE = 1000; // in ms

    private boolean blinkingOn = false;
    static long count = 0;
    private boolean blinkingOff = false;

    public ElevatorProject(String text) {
        super(text);
        ImageIcon imgThisImg = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\UpArrowImage.png");
        super.setIcon(imgThisImg);
        timer = new Timer(BLINKING_RATE, new TimerListener(this));
        timer.setInitialDelay(0);
        timer.start();

    }

    public void setBlinking(boolean flag) {
        this.blinkingOn = flag;
        this.blinkingOff = flag;
    }

    public boolean getBlinking(boolean flag) {
        return this.blinkingOn && this.blinkingOff;
    }

    public static JLabel j1;
    public static Timer timer;
    public static JButton b6, b2, b5, b4, b10, b1, b3, b11,b9;
    public static int tc;

    private class TimerListener implements ActionListener {
        private ElevatorProject bl;
        private Color bg;
        private Color fg;
        private boolean isForeground = true;

        public TimerListener(ElevatorProject bl) {
            this.bl = bl;
            fg = bl.getForeground();
            bg = bl.getBackground();
        }

        public void actionPerformed(ActionEvent e) {
            int cnt = 1;


            if (bl.blinkingOn) {
                if (isForeground) {
                    bl.setForeground(fg);

                    for (long ccnt = 0; ccnt <= cnt; ccnt = ccnt + 1000) {
                        count = count + 1000;
                        switch (tc) {
                            case 6:
                                if (count == 10000) {
                                    j1.setText("2 Floor");
                                } else if (count == 20000) {
                                    j1.setText("3 Floor");
                                } else if (count == 30000) {
                                    j1.setText("4 Floor");
                                } else if (count == 40000) {
                                    j1.setText("5 Floor");
                                } else if (count == 50000) {
                                    j1.setText("6 Floor");
                                } else if (count > 50000) {
                                    // j1.setText( "count " + count);
                                    timer.stop();

                                }
                                break;
                            case 5:
                                if (count == 10000) {
                                    j1.setText("2 Floor");
                                } else if (count == 20000) {
                                    j1.setText("3 Floor");
                                } else if (count == 30000) {
                                    j1.setText("4 Floor");
                                } else if (count == 40000) {
                                    j1.setText("5 Floor");

                                } else if (count > 40000) {

                                    timer.stop();

                                }
                                break;
                            case 4:
                                if (count == 10000) {
                                    j1.setText("2 Floor");
                                } else if (count == 20000) {
                                    j1.setText("3 Floor");
                                } else if (count == 30000) {
                                    j1.setText("4 Floor");
                                } else if (count > 30000) {
                                    // j1.setText( "count " + count);
                                    timer.stop();

                                }
                                break;
                            case 3:
                                if (count == 10000) {
                                    j1.setText("2 Floor");
                                } else if (count == 20000) {
                                    j1.setText("3 Floor");
                                }  else if (count > 20000) {
                                    // j1.setText( "count " + count);
                                    timer.stop();

                                }
                                break;
                            case 2:
                                if (count == 10000) {
                                    j1.setText("2 Floor");
                                }  else if (count > 10000) {
                                    // j1.setText( "count " + count);
                                    timer.stop();

                                }
                                break;
                        }

                    }
                } else {
                    bl.setForeground(bg);
                }
                isForeground = !isForeground;
            } else {

                if (isForeground) {
                    bl.setForeground(fg);
                    isForeground = false;
                }
            }
        }

    }

    // --- for testing
    private static void Elavatorex() {
        JFrame frame = new JFrame("Elevator");
        JPanel jp = new JPanel();
        jp.setBounds(10, 20, 200, 400);
        jp.setBackground(Color.gray);
        jp.setLayout(null);

        JPanel jp21 = new JPanel();
        jp21.setBounds(10, 10, 180, 80);
        jp21.setBackground(Color.lightGray);
        jp21.setLayout(null);
        j1 = new JLabel("1");
        j1.setBounds(70, 10, 150, 100);
        jp21.add(j1);
        jp.add(jp21);

        JPanel jp212 = new JPanel();
        jp212.setBounds(10, 100, 180, 80);
        jp212.setLayout(null);

        final ElevatorProject bl = new ElevatorProject("UP");

        bl.setBounds(70, 120, 150, 100);
        bl.setBackground(Color.black);

        jp.add(bl);

        JPanel jp2 = new JPanel();
        jp2.setBounds(10, 220, 180, 80);
        jp2.setBackground(Color.yellow);
        jp2.setLayout(null);

        final JLabel bf = new JLabel("Fan Off");
        bf.setBounds(20, 20, 150, 50);

        jp2.add(bf);
        jp.add(jp2);



        JPanel jpp = new JPanel();
        jpp.setBounds(300, 20, 200, 400);
        jpp.setLayout(null);

        /*  Button for 1st flour */

        b1 = new JButton("1");
        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 1;
                        timer.start();
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b1.setBounds(1, 50, 100, 50);
        jpp.add(b1);

        /*  Button for 2nd flour */

        b2 = new JButton("2");
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 2;
                        timer.start();
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b2.setBounds(111, 50, 100, 50);
        jpp.add(b2);

        /*  Button for 3rd flour */

        b3 = new JButton("3");
        b3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 3;
                        timer.start();
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b3.setBounds(1, 120, 100, 50);
        jpp.add(b3);

        /*  Button for 4th flour */
        b4 = new JButton("4");
        b4.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 4;
                        timer.start();
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b4.setBounds(111, 120, 100, 50);
        jpp.add(b4);

        /*  Button for 5th flour */
        b5 = new JButton("5");
        b5.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 5;
                        timer.start();
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b5.setBounds(1, 190, 100, 50);
        jpp.add(b5);

        /*  Button for 6th flour */
        b6 = new JButton("6");
        b6.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        tc = 6;
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b6.setBounds(111, 190, 100, 50);
        jpp.add(b6);

        /*  Button for fan */
        b11 = new JButton("Fan");
        b11.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        String f = bf.getText();
                        if (f.equals("Fan off")) {
                            bf.setText("Fan on");
                        } else {
                            bf.setText("Fan off");
                        }
                        // bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b11.setBounds(1, 260, 100, 50);
        jpp.add(b11);

        frame.add(jp);
        frame.add(jpp);

        b9 = new JButton("light");
        b9.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        String f = bf.getText();
                        if (f.equals("light off")) {
                            bf.setText("light on");
                        } else {
                            bf.setText("light off");
                        }
                        // bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b9.setBounds(1, 330, 100, 50);
        jpp.add(b9);
        //jp.add(b);
        frame.add(jp);
        frame.add(jpp);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700, 600);


        frame.setVisible(true);



        /*  Button for door  */
        b10 = new JButton("Door");
        b10.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        String f = bf.getText();
                        if (f.equals("Door Close")) {
                            bf.setText("Door Open");
                            bl.blinkingOff = !bl.blinkingOff;
                        } else {
                            bf.setText("Door Close");

                        }

                    }
                });
        b10.setBounds(111, 260, 100, 50);
        jpp.add(b10);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Elavatorex();
            }
        });
    }
    // ---
}
