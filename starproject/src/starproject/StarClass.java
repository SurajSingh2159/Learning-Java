package starproject;

public class StarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
/*for(i=1;i<=10;i++)  // Right angled triangle
{
	for(j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println( );
}*/
		for(i=10;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
