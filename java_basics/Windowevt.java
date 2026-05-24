import javax.swing.*;
import java.awt.event.*;
public class Windowevt extends JFrame
{
Static JFrame f;
public static void main(String args[])
{
Windowevt=new Windowevt();
f.setVisible(true);
}
public Windowevt()
{
f=new JFrame("Display");
Winevent w=new Winevent();
f.addWindowListener(w);
f.setSize(300,400);
}
class Winevent implements WindoeListener
{
public void WindowClosing(WindowEvent e)
{
System.out.println("Window Closing");
}
public void WindowOpened(WindowEvent e)
{
System.out.println("Window Opened");
}
public void WindowClosed(WindowEvent e)
{
System.out.println("Closed");
}
public void WindowDeactivated(WindowEvent e)
{
System.out.println("Deactivated");
}
public void WindowIconified(WindowEvent e)
{
System.out.println("Iconified");
}
public void WindowDeIconified(WindowEvent e)
{
System.out.println("DeIconified");
}
public void WindowActivated(WindowEvent e)
{
System.out.println("Activated");
}
}
}