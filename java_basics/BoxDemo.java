class Box
{
double width;
double depth;
double height;
}
class BoxDemo
{
public static void main(String args[])
{
Box b=new Box();
double vol;
b.width=10;
b.height=15;
b.depth=20;
vol=b.width*b.depth*b.height;
System.out.println("Volume is="+vol);
}
}