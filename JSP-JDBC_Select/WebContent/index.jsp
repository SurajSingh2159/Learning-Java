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
while(rs.next())
{
out.print("<b>"+rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getDate(4)+"</b>");
out.print("</br>");
} //end of loop
conn.close();
} //end opf try block
catch(Exception er)
{
out.print(er);	
}
%>