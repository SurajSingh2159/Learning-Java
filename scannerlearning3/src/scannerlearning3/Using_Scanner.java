package scannerlearning3;

import java.util.*;

public class Using_Scanner {

	public static void main(String[] args) {
		int a;
		float b,c;
		Scanner rd = new Scanner(System.in);
		System.out.print("Enter the value of a and b");
        a=rd.nextInt();
        b=rd.nextFloat();
        c=a*b;
        System.out.println("output="+c);
	}

}
