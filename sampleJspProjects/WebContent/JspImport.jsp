<%@page import="java.util.*" %>
<html>
<body>
<h1>Decalaration Tag</h1>
<%!
String name="Suraj";
int num=100;
%>
<h1>Expression Tag</h1>x
Emp_Name=<%=name %><br>
value of num=<%=num %><br>
<h1>Scriptlet Tag</h1>
<%Date Today_Date=new Date();
out.println("Today Date="+Today_Date);%>


</body>
</html>