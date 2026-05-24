class Student2
{
int rollno;
String name;
String college="ITS";
Student2(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+"   "+name+"   "+college);
}
public static void main(String args[])
{
Student2 s1=new Student2(111,"MPC");
Student2 s2=new Student2(222,"JAD");
s1.display();
s2.display();
}
}