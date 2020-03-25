package thisKeyword;
class 	Products
{
	String Product_Name;
	String Description;
	float Price;
Products(String Product_Name, String Description, float Price)// CONSTRUCTOR OF BOOK CLASS WITH ARGUMENT
//name of the constructor is same as the name of the class
{
	this.Product_Name=Product_Name;
	this.Description=Description;
	this.Price=Price;
}
void show_data()
{
	System.out.println("Product_Name="+Product_Name);
	System.out.println("Description-"+Description);
	System.out.println("Price="+Price);
}
}

public class ThisKeyword {

	public static void main(String[] args) {
	Products pref=new Products("Alphonso","Speciecs of Mango",500);
	pref.show_data();

	}

}
