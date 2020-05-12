package myconnectionInsert;

import java.sql.*;
import java.util.*;

public class MyMainClass3 {

	public static void main(String[] args) {
		String Query,name,location;
		int id, generation;
		PreparedStatement Pst;
		
		Connection Conn=MyConnectionInsert.Connection_Method();
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the id,name,generation and location");
		id=rd.nextInt();
		name=rd.nextLine();
		generation=rd.nextInt();
		location=rd.nextLine();
		
Query="insert into FAMILY_GENERATION values(?,?,?,?)";
try
{
Pst=Conn.prepareStatement(Query);
Pst.setInt(1,id);
Pst.setString(2, name);
Pst.setInt(3,generation);
Pst.setString(4,location);
int rtn = Pst.executeUpdate();
 System.out.println(rtn);
}// End of try block
catch(SQLException er)
{
System.out.println(er.getMessage());	
}


	}

}
