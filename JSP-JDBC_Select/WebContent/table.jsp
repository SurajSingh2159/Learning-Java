<%@ page import ="java.sql.*" %>

<%
Connection conn;
PreparedStatement pst;
ResultSet rs;
try
{
Class.forName("com.mysql.jdbc.Driver"); //Registration of Driver for mysql
conn=DriverManager.getConnection("jdbc:mysql:///company01","root","root");
pst=conn.prepareStatement("select * from department");
rs=pst.executeQuery();
out.print("<table border=1><tr><th>Dname</th><th>Dnumber</th><th>Mgr_id</th><th>Mgr_start_date</th></tr>");
while(rs.next())
{
out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getDate(4)+"</td></tr>");
} //end of loop
out.print("</table>");
conn.close();
} //end opf try block
catch(Exception er)
{
out.print(er);	
}
%>