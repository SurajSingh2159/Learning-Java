package tryCatchException;

public class ExceptionTryCatch1 {

		public static void main(String[] args) {
			int a=100,b=10,c;
			try
			{
				c=a/b;
				System.out.println("Quotient is"+c);
				a=10 ; b=199;
				c=a*b;
				System.out.println("multiplication is"+c);
			}//End of try block
	    catch(ArithmeticException er)
			{
	    	System.out.println("Division by zero error");
			}
			// Common Statements
			System.out.println("I am a software developer");
		}

	}


