import java.awt.*;
class Gui extends Frame
{
public Gui(String s)
{
super(s);
setBackground(Color.blue);
setLayout(new FlowLayout());
Button pushButton=new Button("press me");
add(pushButton);
}
}
class Ex_1
{
public static void main(String args[])
{
Gui screen=new Gui("Example 1");
screen.setSize(500,100);
screen.setVisible(true);
}
}