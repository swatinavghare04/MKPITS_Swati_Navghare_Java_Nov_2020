package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class MenuItemAndMenuEx extends Frame {
    MenuItemAndMenuEx(){
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
        Menu subm = new Menu("SubMenu");
        MenuItem mt1 = new MenuItem("Item 1");
        MenuItem mt2 = new MenuItem("Item 2");
        MenuItem mt3 = new MenuItem("Item 3");
        MenuItem mt4 = new MenuItem("Item 4");
        MenuItem mt5 = new MenuItem("Item 5");
        m.add(mt1);
        m.add(mt2);
        m.add(mt3);
        subm.add(mt4);
        subm.add(mt5);
        m.add(subm);
        mb.add(m);
        setMenuBar(mb);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args){
        new MenuItemAndMenuEx();
    }
}
