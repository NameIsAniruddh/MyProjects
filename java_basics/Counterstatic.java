class Counterstatic
{
static int count=0;
Counterstatic()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
Counterstatic c1=new Counterstatic();
Counterstatic c2=new Counterstatic();
Counterstatic c3=new Counterstatic();
}
}
