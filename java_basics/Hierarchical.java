class Side
{
int s;
public Side()
{
s=7;
}
public void print()
{
System.out.println("Side="+s);
}
}
class Square extends Side
{
public int area()
{
return(s*s);
}
}
class Cube extends Side
{
public int area()
{
return(s*s*s);
}
}
class Hierarchical
{
public static void main(String args[])
{
Square S=new Square();
Cube c=new Cube();
c.print();
System.out.println("Area of square="+S.area());
System.out.println("Area of cube="+c.area());
}
}