class Overloaddemo
{
void test()
{
System.out.println("No parameters");
}
void test(int a)
{
System.out.println("a:"+a);
}
void test(int a,int b)
{
System.out.println("a:b="+a+b);
}
double test(double a)
{
System.out.println("Double a:"+a);
return a+a;
}
}
class Overload
{
public static void main(String args[])
{
Overloaddemo ob=new Overloaddemo();
ob.test();
ob.test(10);
ob.test(10,20);
System.out.println("Result of ob.test(123.86):"+ob.test(123.86));
}
}

