/* Behaviour of Constructors with Argument(Parametarised)*/
package constructorWithArgs;
class Products
{
long Product_Id;
float Price;

Products(long Product_Id2, float Price2)// Constructors with args
{
Product_Id=Product_Id2;
Price=Price2;
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

Cellphones(long Product_Id1, float Price1, int RAM1, int HDD_Space1)// Constructors with args
{
super(Product_Id1,Price1);// Here super is used to invoke the constructor with argument of immediate super class
RAM=RAM1;
HDD_Space=HDD_Space1;
}
void Show_Data()
{
	super.Show_Data();
System.out.println("RAM="+RAM);
System.out.println("HDD_Space="+HDD_Space);
}
}//End of Sub Class


public class ConstructorWithArgs {

	public static void main(String[] args) {
		Cellphones sref=new Cellphones(101,59999.99f,4,1);
		sref.Show_Data();

	}

}
