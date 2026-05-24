class StatStudent
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="BBDIT";
}
StatStudent(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
StatStudent.change();
StatStudent s1=new StatStudent(111,"Karan");
StatStudent s2=new StatStudent(222,"Aryan");
StatStudent s3=new StatStudent(333,"Sonoo");
s1.display();
s2.display();
s3.display();
}
}

