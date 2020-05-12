package myconnectionInsert;

import java.sql.*;
import java.util.*;

public class MyMainClass3 {

	public static void main(String[] args) {
		String Query, Fname, Mname;
		int Employee_id;
		PreparedStatement Pst;
		
		Connection Conn=MyConnectionInsert.Connection_Method();
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the First name, Middle Name And employee id");
		Fname=rd.nextLine();
		Mname=rd.nextLine();
		Employee_id=rd.nextInt();
		
Query="insert into employee values(?,?,?)";
try
{
Pst=Conn.prepareStatement(Query);
Pst.setInt(1,Employee_id);
Pst.setString(2, Fname);
Pst.setString(3,Mname);
Pst.executeUpdate();
}// End of try block
catch(SQLException er)
{
System.out.println(er.getMessage());	
}


	}

}
