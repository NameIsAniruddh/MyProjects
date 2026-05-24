import java.io.*;
public class Readline
{
public static void main(String[]args)throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader bufReader=new BufferedReader(isr);
System.out.println("Enter a String");
String str=bufReader.readLine();
System.out.println("Enter a integer");
int i=Integer.parseInt(bufReader.readLine());
System.out.println("String is:"+str);
System.out.println("Integer:"+i);
}
}
