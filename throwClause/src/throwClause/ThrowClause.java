package throwClause;

public class ThrowClause {

	public static void main(String[] args) throws Exception {
		int x=10,y=5,z=60,k;
		try
		{
		k=(x*y)-z;
		if(k<0)
		{
			Exception er=new Exception("Invalid Output....");
			throw(er);//send the control to the catch blosk
		}//End of if
		System.out.println("output="+k);
		}//End of try block
		catch(Exception ref)
		{
			System.out.println(ref);
		}
		System.out.println("Suraj Singh");
	}

}
