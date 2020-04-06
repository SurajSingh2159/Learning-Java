//Creating setters and getters automatically using insert code facility
package getterSetterJava2;

class Products
{
long pcode;
float price;
// How we will create getter setter without having type the code
public long getPcode() //alt+shift+S
{
	return pcode;
}
public void setPcode(long pcode) 
{
	this.pcode = pcode;
}
public float getPrice() 
{
	return price;
}
public void setPrice(float price) 
{
	this.price = price;
}

/*void setPcode(long pcode)// setter for pcode
{
this.pcode=pcode;	
}
long getPcode()/getter for pcode
{
 return pcode;	
}
void setPrice(float price)//setter for price
{
this.price=price;	
}
float getPrice()//getter for price
{
return price;	
}*/
}
public class Automation {

	public static void main(String[] args) {
		Products pr1= new Products();
		pr1.setPcode(10001);
		long mpcode=pr1.getPcode();
		System.out.println("Product code="+mpcode);
		//now lets set the value for price
		pr1.setPrice(1000100);
		//now lets get the value of price
		float mprice=pr1.getPrice();
		System.out.println("Product price="+mprice);
		

	}

}
