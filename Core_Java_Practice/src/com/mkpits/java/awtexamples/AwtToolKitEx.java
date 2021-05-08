// WAP in java using AWT to demonstrate example of ToolKit(it will give screen width and height in output)

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtToolKitEx {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution = " + t.getScreenResolution());
        Dimension d = t.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }

}
