import java.awt.*;
import java. awt.event.*;
public class ClickMe extends Frame implements ActionListener
{
private Button quit=new Button( "Qu1t");
private Button click=new Button( "CI1ck here");
private TextField text =new TextField(10);
private boolean secondClick=false;
ClickMe()
{
super("Click Example"); 
setLayout (new FlowLayout());
add(quit);
add(click);
click.addActionListener(this);
quit.addActionListener(this);
add ( text); 
pack();
show();
}
public void actionPerformed (ActionEvent e)
{
if (e.getSource()==quit)
System. exit(0);
else if(e.getSource()==click)
{
if(secondClick)
text.setText( "not again I");
else
text.setText("Uh, it tickles") ;
secondClick = !secondClick;
}
}
public static void main(String args[])
{
ClickMe myFrame=new ClickMe(); 
}
}