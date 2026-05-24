import java.awt.*;
import java.awt.event.*;
class Aevent extends Frame
{
TextField tf;
Aevent()
{
tf=new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("Click");
b.setBounds(50,120,80,30);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
tf.setText("Hello");
}

public static void main(String args[])
{
Aevent ae=new Aevent();
}
}
