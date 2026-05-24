class Nos
{
int a,b;
public Nos()
{
a=7;
b=9;
}
public void print()
{
System.out.println("A="+a);
System.out.println("B="+b);
}
}
class Swap extends Nos
{
public void swap()
{
int t=a;
a=b;
b=t;
}
}
class Singleinhrt
{
public static void main(String args[])
{
Swap s=new Swap();
System.out.println("Before Swaping");
s.print();
s.swap();
System.out.println("After Swaping");
s.print();
}
}