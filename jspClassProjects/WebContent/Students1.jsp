<%@ page import="suraj1.*" %>
<html>
<body>
<!-- Following is a Scriptlet tag -->
<% 
Students sr=new Students(1001, 100.00f,67,89.5f);
float per = sr.Per();
out.println("Percentage="+per);
%>

</body>
</html>