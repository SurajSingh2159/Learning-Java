package firstClassLearning;
import java.util.*;
class Employees
{
	int Emp_Code;
	String Emp_Name;
	float Salary;
	
	void Read_Data()
	{
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the Name,Employee code,Salary");
		Emp_Name=rd.nextLine();
		Emp_Code=rd.nextInt();
		Salary=rd.nextFloat();
	}
	void Show_Data()
	{
		System.out.println("Employee Name="+Emp_Name+"\nEmployee Code="+Emp_Code+"\nSalary="+Salary);
	}
		float GetNetSalary()
	{
		float Net_Sal=Salary-200;
		return Net_Sal;
	}
	}


public class FirstClass {

	public static void main(String[] args) {
		Employees eref1=new Employees();
		Employees eref2=new Employees();
		eref1.Read_Data();
		eref2.Read_Data();
		eref1.Show_Data();
		eref2.Show_Data();
		System.out.println("Net Salary="+eref1.GetNetSalary());
		System.out.println("Net Salary="+eref2.GetNetSalary());

	}

}
