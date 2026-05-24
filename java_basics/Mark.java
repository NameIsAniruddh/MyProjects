import java.io.*;
class Mark
{
int regno;
String name;
int m1;
int m2;
int m3;
int m;
public void read() throws IOException
{
DataInputStream d;
d=new DataInputStream(System.in);
System.out.println("Type reg,name,m1,m2,m3");
regno=Integer.parseInt(d.readLine());
name=d.readLine();
m1=Integer.parseInt(d.readLine());
m2=Integer.parseInt(d.readLine());
m3=Integer.parseInt(d.readLine());
}
public void calc()
{
m=m1+m2+m3;
}
public void print()
{
System.out.println("Regno="+regno);
System.out.println("Name="+name);
System.out.println("M1="+m1);
System.out.println("M2="+m2);
System.out.println("M3="+m3);
System.out.println("M="+m);
}
}