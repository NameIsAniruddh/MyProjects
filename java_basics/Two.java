class Super
{
int a,b;
Super()
{
a=10;
b=20;
}
}
class Sub extends Super
{
int z;
void show()
{
Super(a+b);
System.out.println(z);
}
}
class Two
{
public static void main(String args[])
{
Sub o=new Sub();
o.show();
}
}