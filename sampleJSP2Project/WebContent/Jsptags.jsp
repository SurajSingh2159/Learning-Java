<html>
<body>
<%--following is the declaration tag --%>
<%!
String name="Suraj";
int num=100;
int addition(int a, int b)
{
int c=a+b;
return c;
}
%>
<%--Following is an expression tag --%>
Emp_Name=<%=name %><br>
value of num=<%=num %><br>
output is=<%=addition(1222,337) %>


</body>
</html>