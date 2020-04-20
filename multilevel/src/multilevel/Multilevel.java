package multilevel;
import java.util.Scanner;
class Citizens
{
private long ID_Number;
private int Age;
void Read_Data()
{
Scanner rd=new Scanner(System.in);
System.out.println("Enter the Citizen ID and Age");
ID_Number=rd.nextLong();
Age=rd.nextInt();
}
void Show_DaTa()
{
System.out.println("ID_Number="+ID_Number);
System.out.println("Age="+Age);
}
}// End of Super Class Citizen
class Employees extends Citizens
{
private long Emp_code;
private float Salary;
void Read_Data()//Overriding Method
{
super.Read_Data();
Scanner rd= new Scanner(System.in);
System.out.println("Enter Employee code and Salary");
Emp_code=rd.nextLong();
Salary=rd.nextFloat();
}
void Show_Data()//Overriding Method
{
super.Show_DaTa();
System.out.println("Emp_code="+Emp_code);
System.out.println("Salary="+Salary);
}
}//End of class Employees
class Supervisor extends Employees
{
private float Department;
void Read_Data()//Overriding Method
{
super.Read_Data();
Scanner rd= new Scanner(System.in);
System.out.println("Enter the Department Name");
Department=rd.nextFloat();
}
void Show_Data()//Overriding Method
{
super.Show_DaTa();
System.out.println("Department="+Department);
}
}//End of class Supervisor

public class Multilevel {

	public static void main(String[] args) {
	  Supervisor pref=new Supervisor();
	  pref.Read_Data();
	  pref.Show_Data();

	}

}
