package myconnectionInsert;
import java.sql.*;
import java.util.*;

public class MyConnectionDelete {

	public static void main(String[] args) {
		int id;
		PreparedStatement Pst;
		String Query=null;
		Scanner rd=new Scanner(System.in);
		Connection Conn=MyConnectionInsert.Connection_Method();
		
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
		
		System.out.println("Enter the id");
		id=rd.nextInt();
		
Query="delete from FAMILY_GENERATION where id=?";
try
{
Pst=Conn.prepareStatement(Query);
Pst.setInt(1,id);
Pst.executeUpdate();
}// End of try block
catch(SQLException er)
{
System.out.println(er.getMessage());	
}


	}

}
