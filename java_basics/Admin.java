import java.lang.*;
import java.util.*;
interface Emp
{
void display(int i);
}
class employee
{
 String emp_name[]=new String[100];
 int emp_id[]=new int[10];
 int emp_salary[]=new int[10];
Scanner input=new Scanner(System.in);
void getdata(int i)
 {
System.out.println("Enter the employee name"+i +":");
 emp_name[i]=input.nextLine();
 System.out.println("Enter the employee id"+i +":"); 
emp_id[i]=input.nextInt();
System.out.println("Enter the employee salary"+i + ":");
emp_salary[i]=input.nextInt();
}
 }
 class Admin extends employee implements Emp
{
public void display(int i)
 {
 System.out.println("Employee name"+i +":" +emp_name[i]);
System.out.println("Employee id"+i +":" +emp_id[i]);
System.out.println("Employee salary"+i +":" +emp_salary[i]);
}
}
class Main
{
public static void main(String[] args)
{
Admin obj=new Admin();
 int n;
 Scanner inp=new Scanner(System.in);
 System.out.println("Enter the numner of employess:");
 n=inp.nextInt();
 for(int i=1;i<=n;i++)
 {
 obj.getdata(i);
}
System.out.println("==================");
System.out.println("\t\tDETAILS LIST\t\t\n");
 for(int i=1;i<=n;i++)
 {
obj.display(i);
 }
}
}