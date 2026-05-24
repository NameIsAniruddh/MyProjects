class Pnr
{
int interest;
int principal,num,rate;
Pnr(int pr,int no,int r)
{
principal=pr;
num=no;
rate=r;
}
void show()
{
interest=(principal*num*rate)/100;
System.out.println("The simple interest is"+interest);
}
public static void main(String args[])
{
Pnr obj=new Pnr(1000,2,5);
obj.show();
}
}