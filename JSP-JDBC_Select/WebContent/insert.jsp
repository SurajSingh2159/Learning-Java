<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.PreparedStatement" %>
<%@ page import ="java.sql.DriverManager" %>

<%
Connection conn;
PreparedStatement pst;
try
{
Class.forName("com.mysql.jdbc.Driver"); //Registration of Driver for mysql
conn=DriverManager.getConnection("jdbc:mysql:///company01","root","root");
String sq1="insert into department(Dname,Dnumber,Mgr_id,) value(?,?,?)";
String Dname=request.getParameter("Dname");
int Dnumber=Integer.parseInt(request.getParameter("Dnumber"));
int Mgr_id=Integer.parseInt(request.getParameter("Mgr_id"));
pst=conn.prepareStatement("sq1");
pst.setString(1,Dname);
pst.setInt(2,Dnumber);
pst.setInt(3,Mgr_id);
pst.execute();// executing SQL Statement
conn.close();
} //end opf try block
catch(Exception er)
{
out.print(er);	
}
%>