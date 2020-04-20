/* Behaviour of Constructors without Argument(Non Parametarised)*/
package constructorsWithoutArgs;
class Products
{
long Product_Id;
float Price;

Products()// Constructors without args
{
System.out.println("Control is in constructor of super class");
Product_Id=1001;
Price=10000;
}
void Show_Data()
{
System.out.println("Product_Id="+Product_Id);
System.out.println("Price="+Price);
}
}//End of Super Class

class Cellphones extends Products
{
int RAM;
int HDD_Space;

Cellphones()// Constructors without args
{
	System.out.println("Control is in constructor of sub class");
	RAM=4;
	HDD_Space=1;
	}
	void Show_Data()
	{
	System.out.println("RAM="+RAM);
	System.out.println("HDD_Space="+HDD_Space);
	}
	}//End of Sub Class

public class ConstructorsWithoutArgs {

	public static void main(String[] args) {
		Cellphones cref=new Cellphones();
		cref.Show_Data();

	}

}
