<html>
<body>
<%--following is the declaration tag --%>
<%!
int cube(int a)
{
int cb;
cb=a*a*a;
return cb;
}
%>
<%--Following is an expression tag --%>
<%=cube(10) %><br>
<%=cube(13) %>


</body>
</html>