package getterSetterJava;
class Employees
{
	private int empcode;
	private float salary;
	void setEmpcode(int empcode)// setter for empcode
	{
		this.empcode=empcode;
	}
	int getEmpcode;// getter for empcode
	{
		return empcode;
	}
	void setSalary(float salary)//setter for salary
	{
		this.salary=salary;
	}
	float getSalary;//getter for salary
	{
		return salary;
	}
}

public class GetSet1 {

	public static void main(String[] args) {
		Employees sr1=new Employees();
		eri.setEmpcode(1001);
		int mecode=sr1.getEmpcode();
		System.out.println("Empoyee code="+mecode);
		eri.setSalary(100000);
		int mesalary=sr1.getSalary();
		System.out.println("Empoyee salary="+mesalary);

	}

}
