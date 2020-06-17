<html>
<body>
<%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
/* we used request method getParameter values to retrive all the checked values
and put them into array arr */
String []arr=request.getParameterValues("subjects");
out.println("<b>"+fname+" "+lname+" have the following subjects</b>");
for(String str:arr)
{
out.println("<br>"+str);	
}
%>
</body>
</html>