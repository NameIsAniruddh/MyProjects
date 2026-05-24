class Function
{
void area()
{
int a=10;
System.out.println("The area of Square is:"+(a*a));
}
void area(int a)
{
System.out.println("The area of circle is:"+(3.14*a*a));
}
void area(float l,float b)
{
System.out.println("The area of rectangle"+(l*b));
}
void area(int a,float b)
{
System.out.println("The area of triangle"+(0.5*a*b));
}
}
class FuncOverload
{
public static void main(String args[])
{
Function f=new Function();
f.area();
f.area(6);
f.area(5.5f,5.5f);
f.area(5,6.5f);
}
}
