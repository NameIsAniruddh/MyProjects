import java.awt.*;
import java.applet.*;
public class DisplayImage extends Applet
{
Image picture;
public void init()
{
picture=getImage(getDocumentBase(),"C:\Users\Aniruddh\OneDrive\Pictures\Saved Pictures\wp6200922");
}
public void paint(Graphics g)
{
g.drawImage(picture,30,30,this);
}
public static void main(String[]args)
{
DisplayImage obj=new DisplayImage();
}
}
