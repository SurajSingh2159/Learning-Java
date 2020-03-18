package array2Dlearning9;
import java.util.*;
public class Array2D {
	public static void main(String[] args)
	{
		int values[] []=new int[5][5];
		Scanner rd=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("values["+i+"]["+j+"]=");
				values[i][j]=rd.nextInt();
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(values[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
