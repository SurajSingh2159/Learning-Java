<%@ page import="java.util.*"%>
<html>
<body>
<form action="session1.jsp">
Enter the book name:<input type="text" name="btext">
<input type="submit" value="click me">
</form>
<!-- Following is a scriptlet tag -->
<%
List <String>myBooks=(List <String>)session.getAttribute("sess1");
if(myBooks==null)
{
myBooks=new ArrayList<String>();
session.setAttribute("sess1", myBooks);
}
String str=request.getParameter("btext");
if(str!=null&&str!="")
myBooks.add(str);
//Printing the books in session objects
%>
<ol>
<%
for(String val:myBooks)
{
out.println("<b><li>"+val+"</li></b>");	
}
%>
</ol>
</body>
</html>