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
System.out.println("i="+i+"j="+j);
}
}
class Sub extends Mainclass
{
int k;
Sub(int x,int y,int z)
{
super(x,y);
k=z;
}
void display()
{
super.display();
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