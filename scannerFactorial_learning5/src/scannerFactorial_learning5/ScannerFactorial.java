package scannerFactorial_learning5;
import java.util.*;

public class ScannerFactorial {

	public static void main(String[] args) {
		double var,fact=1;
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the values");
		var=rd.nextDouble();
		for(;var>=2;--var)
		{
			fact=fact*var;
		}
		System.out.println("Factorial="+fact);
	}

}
