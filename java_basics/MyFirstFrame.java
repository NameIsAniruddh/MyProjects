import java.awt.*;
import java.awt.event.*;
public class MyFirstFrame extends Frame implements ActionListener
{
private Button quit = new Button("Quit");
public MyFirstFrame()
{
super("Test Window");
add(quit);
pack();
show();
quit.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
dispose();
System.exit(0);
}
public static void main(String args[])
{
MyFirstFrame mf = new MyFirstFrame();
}
}
 