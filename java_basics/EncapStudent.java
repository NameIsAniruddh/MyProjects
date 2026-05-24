public class EncapStudent
{
private String name;
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
}
class Test
{
public static void main(String args[])
{
EncapStudent s=new EncapStudent();
s.setname("VIJAY");
System.out.println(s.getName());
}
}