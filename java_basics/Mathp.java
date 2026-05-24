import java.lang.Math.*;
public class Mathp
{
public void Circle(double r)
{
double area=Math.PI*r*r;
System.out.println("The area is"+area);
}
public static void main(String args[])
{
Mathp ob=new Mathp();
ob.Circle(2.4);
}
}
