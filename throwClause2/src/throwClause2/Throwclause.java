package throwClause2;

public class Throwclause {
	static void check(int a) throws IllegalAccessException
	{
		int b=a*100;
		if(b>=1000)
		{
			IllegalAccessException ir=new IllegalAccessException("Invalid output.....");
		throw(ir);
		}
	}

	public static void main(String[] args) {
		int var=100;
		try
		{
			check(var);
		}
		catch(IllegalAccessException ir)
		{
			System.out.println(ir);
		}

	}

}
