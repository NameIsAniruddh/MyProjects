public class Testarray
{
public static void main(String a[])
{
int i;
double[]mylist={1.9,2.8,7.2,6.8};
for(i=0;i<mylist.length;i++)
{
System.out.println(mylist[i]+"");
}
double total=0;
for(i=0;i<mylist.length;i++)
{
total+=mylist[i];
}
System.out.println(total);
double max=mylist[0];
for(i=0;i<mylist.length;i++)
{
if(mylist[i]>max)
max=mylist[i];
}
System.out.println("Max is"+max);
}
}