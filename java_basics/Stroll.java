class Sample
{
static int i=0;
String name;
Sample(String name)
{
i=i+1;
this.name=name;
}
}
class Stroll
{
public static void main(String args[])
{
Sample obj1=new Sample("Anitha");
System.out.println(Sample.i);
System.out.println(obj1.name);
Sample obj2=new Sample("Madhu");
System.out.println(Sample.i);
System.out.println(obj2.name);
}
}