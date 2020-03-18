package arrayLearning7;
import java.util.*;
public class ArrayLearning {
	public static void main(String[] args)
	{
		int number[]=new int[10];
		Scanner rd= new Scanner(System.in);
		for(int c=0;c<=10;c++)
		{
			System.out.print("number["+c+"]=");
			number[c]=rd.nextInt();
		}
	}

}
