package Myfirstpack;
class Balance
{
String name;
double bal;
Balance(String n,double b)
{
name=n;
bal=b;
}
void show()
{
if(bal<0)
System.out.println("-->");
System.out.println(name+":Rs"+bal);
}
}
class Accbalance
{
public static void main(String args[])
{
Balance[]current=New Balance[3];
current[0]=new Balance("A",2150);
current[1]=new Balance("B",4400);
current[2]=new Balance("C",5000);
for(int i=0;i<3;i++)
current[-1].show();
}
}