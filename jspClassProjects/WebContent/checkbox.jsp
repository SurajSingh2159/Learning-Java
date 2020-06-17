<html>
<body>
<%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
/* this method demonstrate how nto read from the checkbox */
boolean flag=request.getParameter("mar")!=null;
if(flag==true)
	out.println("<b>"+fname+ " "+lname+ " is married</b>");
else
	out.println("<b>"+fname+ " "+lname+ " is single</b>");
%>
</body>
</html>