package interfaceJava;
/*interface ref. var. can be assigned thr reference of the object of the class which
 has implemented this interface */
interface first
{
float Calculate_Interest(int p, float t, float r);// Method Signature
int Compute_Tax(int Salary);// Method Signature
static final float var=1000.0f;// Declaration of static final variable
}// end of interface body
class Accounts implements first{
	
public float Calculate_Interest(int p, float t, float r)
{
float Simple_Interest=(p*r*t)/100;
return Simple_Interest;
}
public int Compute_Tax(int Salary)
{
	int Tax;
if (Salary>=20000)
	Tax=1000;
else
	Tax=500;
return Tax;
}
void display()
{
System.out.append("Accounts Management");	
}
}
public class InterfaceJava {

	public static void main(String[] args) {
		//first fref=new first();
		first fref=new Accounts();
		System.out.println("first output=" +fref.Calculate_Interest(10000, 5.5f, 5));
		System.out.println("Second output=" +fref.Compute_Tax(30000));
	}

}
