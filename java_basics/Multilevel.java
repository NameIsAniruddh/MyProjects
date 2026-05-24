class Marks
{
protected int mk1,mk2,mk3;
protected int tot;
protected float avg;
public Marks()
{
mk1=80;
mk2=95;
mk3=76;
}
public void put()
{
System.out.println("Mark1:"+mk1);
System.out.println("Mark2:"+mk2);
System.out.println("Mark3:"+mk3);
}
}
class Total extends Marks
{
public void calc()
{
tot=mk1+mk2+mk3;
}
public void give()
{
System.out.println("Total:"+tot);
}
}
class Average extends Total
{
public void calc_a()
{
avg=tot/3;
}
public void put_a()
{
put();
give();
System.out.println("Average:"+avg);
}
}
class Multilevel
{
public static void main(String args[])
{
Average a=new Average();
a.calc();
a.calc_a();
a.put_a();
}
}