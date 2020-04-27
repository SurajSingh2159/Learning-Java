/*Exception Class is a super class of all other super classes
 The catch block having ezception class ref. variable is
  capable of catching all types of exceptions*/
package exceptionSuperClass;

public class ExceptionSuperClass {

	public static void main(String[] args) {
	int x=10,y=5,z=8,q;
	int arr[]= {10,20,30,40};
	try
	{
		q=x/(y-z);
		System.out.println("quotient="+q);
		arr[0]*=2;
		arr=null;
		arr[1]*=2;
	}//End of Try Block
	/* catch(Exception er)
		{
	    	System.out.println("Corona virus");
		}*///Wrong Position of Ctch block
catch(ArrayIndexOutOfBoundsException ar)
	{
	System.out.println(ar.getMessage());
	arr[3]*=2;
	}
	catch(ArithmeticException ar)
	{
		System.out.println(ar.getMessage());
		q=1; //Assumed value
	}
    catch(Exception er)
	{
    	System.out.println("Corona virus");
	}
	System.out.println("Please! I want to go out");
	}

}
