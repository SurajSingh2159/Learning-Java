package multipleCatchBlocks;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
   int x,y,z,sub;
   int arr[]= {100,200,300};
   Scanner rd=new Scanner(System.in);
   try
   {
	   System.out.println("Enter the value of x and y");
	   x=rd.nextInt();
	   y=rd.nextInt();
	   z=x/y;
	   System.out.println("Correct Quotient="+z);
	   System.out.println("Enter the Subscript");
	   sub=rd.nextInt();
	   arr[sub]*=2;
	   for(int k=0;k<3;k++)
	   {
		   System.out.println("arr["+k+"]="+arr[k]);
	   }
   }//End of try block
   catch(ArrayIndexOutOfBoundsException ar)
   {
	   System.out.println(ar);
	   arr[0]*=2;
   }
   catch(ArithmeticException ar)
   {
	   System.out.println(ar);
	   z=1;//Assumed value
   }

	}

}
