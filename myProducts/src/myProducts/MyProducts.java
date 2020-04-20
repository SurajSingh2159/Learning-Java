package myProducts;
import java.util.Scanner;
class Products
{
long Products_code;
float Price;
void Read_Data()
{
Scanner rd=new Scanner(System.in);
System.out.println("Enter the Products code and Price");
Products_code=rd.nextLong();
Price=rd.nextFloat();
}
void Show_DaTa()
{
System.out.println("Product code="+Products_code);
System.out.println("Price="+Price);
}
}// End of Super Class
class Laptop extends Products
{
int RAM;
int HDD_Space;
void Read_Data()//Overriding Method
{
super.Read_Data();
Scanner rd= new Scanner(System.in);
System.out.println("Enter RAM and Hard disk capacity");
RAM=rd.nextInt();
HDD_Space=rd.nextInt();
}
void Show_Data()//Overriding Method
{
super.Show_DaTa();
System.out.println("RAM="+RAM);
System.out.println("HDD_Space="+HDD_Space);
}
}//End of SubClass Laptops

public class MyProducts {

	public static void main(String[] args) {
		Laptop lref= new Laptop();
		lref.Read_Data();
		lref.Show_Data();

	}

}
