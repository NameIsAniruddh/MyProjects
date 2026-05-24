import java.awt.*;
class Gui extends Frame
{
public Gui(String s)
{
super(s);
setBackground(Color.yellow);
setLayout(new FlowLayout());
Button pushButton=new Button("press me");
add(pushButton);
}
}
class Ex_2
{
public static void main(String[]args)
{
Gui screen=new Gui("Example 1");
screen.setSize(500,100);
screen.setVisible(true);
}
}