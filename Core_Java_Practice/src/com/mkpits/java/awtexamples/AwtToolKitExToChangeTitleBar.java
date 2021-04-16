package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class AwtToolKitExToChangeTitleBar {
    AwtToolKitExToChangeTitleBar(){
        Frame f=new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new AwtToolKitExToChangeTitleBar();
    }

}
