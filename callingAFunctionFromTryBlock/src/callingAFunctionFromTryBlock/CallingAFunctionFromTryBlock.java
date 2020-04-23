/* Calling a method from within a try block means handling
 of exception of that called method by the try...catch
of the callin method  */
package callingAFunctionFromTryBlock;

class students
{
long Roll_Number;
String Student_Name;
students(long Roll_Number,String Student_Name)
{
this.Roll_Number=Roll_Number;
this.Student_Name=Student_Name;
}
}
public class CallingAFunctionFromTryBlock {
	static void check()
	{
		students sref=new students(10001,"Suraj Singh");
		System.out.println("Roll number="+sref.Roll_Number);
		System.out.println("Students name="+sref.Student_Name);
		sref=null;
		//sref=new students(1001,"Vivek Singh");
		System.out.println("Roll number="+sref.Roll_Number);
		System.out.println("Students name="+sref.Student_Name);
	}

	public static void main(String[] args) {
		try {
			check();
		}
		catch(NullPointerException er)//Exception Handler
		{
			System.out.println(er);
		}
  System.out.println("This is an important program");
	}

}
