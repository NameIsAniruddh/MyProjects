class Cmd
{
public static void main(String args[])
{
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[0]+args[1]);
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
System.out.println(i+j);
String str=Integer.toString(i);
String str1=Integer.toString(j);
System.out.println(str+str1);
}
}