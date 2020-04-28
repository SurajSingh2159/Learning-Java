/////////////////NESTED  TRY/////////


package nestedtry;

import java.util.Scanner;
public class Nested_try {

	public static void main(String[] args) {
		int x,y,z,sub,totalargs=args.length;
		double value[]= {10.0,20.0,30.0,40.0,50.0};
		Scanner rd=new Scanner(System.in);
		try//OUTER TRY BLOCK
		{
			System.out.println("Enter the values of x and y");
			x=rd.nextInt();
			y=rd.nextByte();
			z=(x*y)/totalargs;
			System.out.println("quotient="+z);
			try // INNER TRY BLOCK
			{
				System.out.println("Enter the Subscript value");
				sub=rd.nextInt();
				value[sub]*=2.0;
			}// END OF INNER TRY BLOCK
			catch(NullPointerException nr)
			{
				System.out.println(nr);
			}// End of inner catch block
		}
		catch(ArithmeticException ar)
		{
			System.out.println(ar);
		}
		catch(ArrayIndexOutOfBoundsException er)
		{
			System.out.println(er);
		}

	}

}
