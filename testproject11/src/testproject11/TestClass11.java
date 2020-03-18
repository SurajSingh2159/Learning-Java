package testproject11;

public class TestClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int n=5;
	//	int n=3;// result continue to execute even after 3
		int n=8;// will execute default 
switch(n)
{
case 1:
	System.out.print("one");
	break; // to terminate the execution after 1st execution
case 2:
	System.out.print("two");
	break;
case 3:
	System.out.println("three");
	break;
case 4:
	System.out.println("four");
	break;
case 5:
	System.out.println("five");
	break;
	default:
		System.out.print("No Match");
}
	}

}
