package myconnectionClass2;

import java.sql.*;


public class MainProgram2 {

	public static void main(String[] args) {
		ResultSet Rst;
		PreparedStatement Pst;
		String Query;
		Connection Conn=MyConnectionClass2.Connection_Method();
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
//Query="select * from Employee where employee_id=20";
Query="select Fname and Lname from Employee";
try
{
Pst=Conn.prepareStatement(Query);
Rst=Pst.executeQuery();
while(Rst.next())
{
System.out.println(Rst.getString(2)+"\t"+Rst.getString(4));	
}// end of loop
}// End of try block
catch(Exception er)
{
System.out.println(er.getMessage());	
}

	}

}
