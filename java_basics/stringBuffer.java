import java.io.*;
public class stringBuffer
{
public static void main(String[]args)throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String str;
try
{
System.out.println("Enter your name:");
str=in.readLine();
str+=",This is the example of StringBuffer class and its functions.";
StringBuffer strbuf=new StringBuffer();
System.out.println(strbuf.length());
strbuf.append(str);
System.out.println(strbuf);
strbuf.delete(0,str.length());
strbuf.append("Hello");
strbuf.append("World");
System.out.println(strbuf);
strbuf.insert(5,"_Java");
System.out.println(strbuf);
strbuf.reverse();
System.out.println(strbuf);
strbuf.setCharAt(5,' ');
System.out.println(strbuf);
System.out.println("Character as 6th position:");
System.out.println(strbuf.charAt(6));
System.out.println("Substring from position 3 to 6:");
System.out.println(strbuf.substring(3,7));
strbuf.deleteCharAt(3);
System.out.println(strbuf);
System.out.println("Capacity of stringbuffer object:");
System.out.println(strbuf.capacity());
strbuf.delete(6,strbuf.length());
System.out.println(strbuf);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
}
}
