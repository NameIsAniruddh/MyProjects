interface WinMedPlayer
{
void play();
}
class CD implements WinMedPlayer
{
public void play()
{
System.out.println("CD is running");
}
}
class DVD implements WinMedPlayer
{
public void play()
{
System.out.println("DVD is running");
}
}
class Final
{
public static void main(String args[])
{
CD c=new CD();
c.play();
DVD d=new DVD();
d.play();
}
}
