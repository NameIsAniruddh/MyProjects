class EncapStudent
{
private String name1;
public String getName()
{
return name1;
}
public void setName(String name)
{
name1=name;
}
}
class Test
{
public static void main(String args[])
{
EncapStudent s=new EncapStudent();
s.setName("VIJAY");
System.out.println(s.getName());
System.out.println(name1="abc");
}
}