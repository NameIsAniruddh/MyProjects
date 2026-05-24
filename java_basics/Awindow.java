import java.awt.*;
class Awindow extends Frame
{
public static void main(String[]args)
{
Frame fr=new Frame("Title");
Label lbl1=new Label("Age");
fr.add(lbl1);
fr.setVisible(true);
fr.setSize(300,300);
}
}