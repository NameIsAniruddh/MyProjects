class Mainclass
{
int i,j;
Mainclass(int x,int y)
{
i=x;
j=y;
}
void display()
{
System.out.println("i="+i+"1+j="+j);
}
}
class Sub extends Mainclass
{
int k;
Sub(int x,int y,int z)
{
Super(x,y,z);
k=z;
}
void display()
{
System.out.println("k="+k);
}
}
class Prog
{
public static void main(String args[])
{
Sub obj=new Sub(3,7,4);
obj.display();
}
}