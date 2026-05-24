class test1
{
int mk1;
public test1()
{
mk1=70;
}
}
interface test2
{
int mk2=90;
public void print();
}
class total extends test1 implements test2
{
public void print()
{
System.out.println("Total="+(mk1+mk2));
}
}
class Multiple
{
public static void main(String args[])
{
total t=new total();
t.print();
}
}