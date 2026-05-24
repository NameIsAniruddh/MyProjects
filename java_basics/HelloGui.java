import java.awt.*;
import javax.swing.*;
public class HelloGui extends JFrame
{
public static void main(String[]args)
{
HelloGui window=new HelloGui();
window.setBounds(300,300,200,100);
Label l=new Label("add");
window.add(l);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setVisible(true);
}
}