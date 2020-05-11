package myconnectionClass;

import java.sql.*;

public class MainProgram {

	public static void main(String[] args) {
		ResultSet Rst;
		PreparedStatement Pst;
		String Query;
		Connection Conn=MyConnectionClass.Connection_Method();
		if(Conn==null)
		{
			System.out.println("Error opening the connection");
			System.exit(0);
		}
Query="select * from employee";
try
{
Pst=Conn.prepareStatement(Query);
Rst=Pst.executeQuery();
while(Rst.next())
{
System.out.println(Rst.getInt(1)+"\t"+Rst.getString(2)+Rst.getString(3)+Rst.getString(4));	
}// end of loop
}// End of try block
catch(Exception er)
{
System.out.println(er.getMessage());	
}
	}

}
