class Market
{
int code;
Market (int c)
{
code=c;
//item=i;
}
}
class customer extends Market
{
double p;
customer (int c, int price)
{
super(c);
p=price;
}
void putdata()
{
System.out.println("enter the code" +code);
//system.ou .println("enter the item" +item);
System.out.println("enter the price" +p);
}
}
class Cus extends customer
{
float d;
Cus(int c,int price, float discount)
{
super(c,price);
d=discount;
}
void putdata()
{
super.putdata();
System.out.println("your discount is:"+d);
}
public static void main(String args[])
{
Cus mam = new Cus(1,56,4);
mam.putdata();
System.out.println("second customer");
}
}