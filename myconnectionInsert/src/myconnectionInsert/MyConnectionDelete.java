package myconnectionInsert;
import java.sql.*;
import java.util.*;

public class MyConnectionDelete {

	public static void main(String[] args) {
		String Fname;
		PreparedStatement Pst;
		String Query=null;
		Scanner rd=new Scanner(System.in);
		Connection Conn=MyConnectionInsert.Connection_Method();
		
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
		
		System.out.println("Enter the Employee id");
		Fname=rd.nextLine();
		
Query="delete from employee where Fname=?";
try
{
Pst=Conn.prepareStatement(Query);
Pst.setString(1,Fname);
Pst.executeUpdate();
}// End of try block
catch(SQLException er)
{
System.out.println(er.getMessage());	
}


	}

}
