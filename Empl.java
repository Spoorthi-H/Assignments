abstract class Employee
{
abstract void salary();
}
class Permanentemp extends Employee
{
public void salary()
{
System.out.println("Permanent Employee Salary is:15000");
}
}
 class Contractemp extends Employee
{
public void salary()
{
System.out.println("Contract Employee Salary is:1000");
}
}
class Details 
{
void disp(Employee e)
{
e.salary();
}
}
 class Empl
{
public static void main(String[] args)
{
Employee p = new Permanentemp();
Employee c= new Contractemp();
Details d =new Details();
d.disp(p);
d.disp(c);
}
}