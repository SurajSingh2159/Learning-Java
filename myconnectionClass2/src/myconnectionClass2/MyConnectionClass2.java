package myconnectionClass2;

import java.sql.*;

public class MyConnectionClass2 {

	static Connection Connection_Method()
	{
		Connection Conn;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Conn=DriverManager.getConnection("jdbc:mysql://localhost/Company02","root","suraj2159");
			return 	Conn;
		}
		catch(Exception er)
		{
			System.out.println(er.getMessage());
		}
		return null;
	}

}
