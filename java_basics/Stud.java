class Stud
{
int rollno;
String name;
void record(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+"     "+name);
}
public static void main(String args[])
{
Stud s1=new Stud();
Stud s2=new Stud();
s1.record(12,"karthi");
s2.record(13,"eddy");
s1.display();
s2.display();
}
}

