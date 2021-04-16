package src.com.mkpits.java.awtexamples;

import java.awt.*;
public class MenuItemAndMenuEx01 {
    MenuItemAndMenuEx01(){
        Frame f= new Frame("Menu and MenuItem Example");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("File");
        Menu submenu=new Menu("Project");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("Open");
        MenuItem i3=new MenuItem("Close");
        MenuItem i4=new MenuItem("Rename");
        MenuItem i5=new MenuItem("Delete");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        Menu menu1=new Menu("Edit");
        MenuItem i11=new MenuItem("Cut");
        MenuItem i22=new MenuItem("Copy");
        MenuItem i33=new MenuItem("Paste");
        menu1.add(i11);
        menu1.add(i22);
        menu1.add(i33);
        mb.add(menu1);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new MenuItemAndMenuEx01();
    }

}
