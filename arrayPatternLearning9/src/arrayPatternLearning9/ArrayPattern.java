package arrayPatternLearning9;

import java.util.*;

public class ArrayPattern {

	public static void main(String[] args) {
		int a[][]=new int[6][];
		Scanner rd=new Scanner(System.in);
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[1];
		a[3]=new int[1];
		a[4]=new int[2];
		a[5]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=rd.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*for(int i=a.length;i>0;i--)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=rd.nextInt();
			}
		}
		for(int i=a.length;i>0;i--)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}*/
	}

}
