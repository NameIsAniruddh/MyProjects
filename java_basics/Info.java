class Info
{
String name;
int age;
String address;
int phoneno;
Info(String n,int a,String add,int pn)
{
name=n;
age=a;
address=add;
phoneno=pn;
}
void display()
{
System.out.println("My name is:"+name);
System.out.println("My age is:"+age);
System.out.println("My address is:"+address);
System.out.println("My ph.number is:"+phoneno);
}
public static void main(String args[])
{
Info i;
i=new Info("karthik",24,"TVM",978524);
i.display();
System.out.println("***************");
i=new Info("Prabhu",25,"Chennai",446211);
i.display();
}
}