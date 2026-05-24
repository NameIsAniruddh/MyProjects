import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu extends JFrame
{
MenuBar m=new MenuBar();
Menu()
{
JFrame fr=new JFrame();
Menu f=new Menu("File");
Menu e=new Menu("Edit");
Menu h=new Menu("Help");
Menu op=new Menu("Option");
MenuItem o=new MenuItem("Open");
MenuItem c=new MenuItem("Close");
MenuItem l=new MenuItem("Exit");
MenuItem u=new MenuItem("Undo");
MenuItem r=new MenuItem("Redo");
MenuItem cu=new MenuItem("Cut");
MenuItem one=new MenuItem("One");
MenuItem two=new MenuItem("Two");
CBM s=new CBM("Status");
f.addseparator();
f.add(o);
f.add(c);
f.add(l);
e.add(u);
e.add(r);
e.add(cu);
h.add(s);
op.add(one);
op.add(two);
m.add(f);
m.add(e);
m.add(h);
fr.setMenu(m);
fr.setSize(300,300);
fr.setVisible(True);
}
public static void main(String args[])
{
Menu obj=new Menu();
}
}
