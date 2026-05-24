class Rectangle
{
int length;
int width;
void draw(int l,int w)
{
length=l;
width=w;
}
void call()
{
System.out.println(length*width);
}
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.draw(5,6);
r2.draw(7,8);
r1.call();
r2.call();
}
}
