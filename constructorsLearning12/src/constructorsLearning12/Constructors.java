package constructorsLearning12;

import java.util.*;
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
void show_data()
{
	System.out.println("Book_code="+Book_code);
	System.out.println("Book_name="+Book_name);
	System.out.println("Author_nmae="+Author_name);
	System.out.println("Book_price="+Book_price);
}
}
public class Constructors {  // name of main class is constructors

	public static void main(String[] args) {
		Books bref1=new Books(1001,"Concept of Pysics", "H C Verma", 500);
		bref1.show_data();
	}

}
