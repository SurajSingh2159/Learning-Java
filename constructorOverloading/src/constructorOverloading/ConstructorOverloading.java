/*Constructor overloading is the is a feature wherby we can have 
  a multiple constructors in the same class. there should be a difference of either
  number of arguments or their data types*/
package constructorOverloading;


class Books
{
	long Book_code;
	String Book_name;
	String Author_name;
	float Book_price;
Books(long Book_code1,String Book_name1,String Author_name1,float Book_price1)// CONSTRUCTOR OF BOOK CLASS WITH ARGUMENT
// name of the constructor is same as the name of the class
{
	Book_code=Book_code1;
	Book_name=Book_name1;
	Author_name=Author_name1;
	Book_price=Book_price1;
}
Books() // default constructor
{}
Books(long Book_code1,String Book_name1)// CONSTRUCTOR OF BOOK CLASS WITH ARGUMENT
//name of the constructor is same as the name of the class
{
	Book_code=Book_code1;
	Book_name=Book_name1;
}
Books(String Book_name1,long Book_code1)// CONSTRUCTOR OF BOOK CLASS WITH ARGUMENT
//name of the constructor is same as the name of the class
{
	Book_code=Book_code1;
	Book_name=Book_name1;
}
void show_data()
{
	System.out.println("Book_code="+Book_code);
	System.out.println("Book_name="+Book_name);
	System.out.println("Author_nmae="+Author_name);
	System.out.println("Book_price="+Book_price);
}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
	Books bref1=new Books(1001,"Concept of Pysics", "H C Verma", 500);
	bref1.show_data();
	Books bref2=new Books();
	bref2.Book_code=10001;
	bref2.Book_name="Higher Engineering Mathematics";
	bref2.Author_name="B.S.Grewal";
	bref2.Book_price=850;
	bref2.show_data();
	Books bref3=new Books(1001,"Concept of Pysics");
	bref3.show_data();
	Books bref4=new Books(1001,"Concept of Pysics2");
	bref4.show_data();
	}

}
