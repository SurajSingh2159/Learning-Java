<html>
<body>
<!-- following is an expresssion tag using getParameter method -->
<%-- First Name: <%=request.getParameter("firstname") %><br>
Middle Name: <%=request.getParameter("middlename") %><br>
Last Name: <%=request.getParameter("lastname") %><br>
Email Id: <%=request.getParameter("emailId") %><br> --%>
First Name:${param.firstname}
<br>
Middle Name:${param.middlename}
<br>
Last Name:${param.lastname}
<br>
Email Id:${param.emailId}
</body>
</html>