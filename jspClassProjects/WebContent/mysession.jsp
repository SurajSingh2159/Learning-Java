<%@ page import="java.io.*,java.util.*"%>
<%
	Date createTime = new Date(session.getCreationTime());
	Date lastAccessTime = new Date(session.getLastAccessedTime());
	String title = "welcome to Suraj Computer";
	Integer visitCount = new Integer(0);
	String userID = "";

	//check if this is new comer on your web page
	if (session.isNew()) {
		title = "Hi, You are visiting Suraj computer for the 1st time";
		session.setAttribute("userIDKey", "Singhji");
		session.setAttribute("visitCountKey", visitCount);
	}
	visitCount = (Integer) session.getAttribute("visitCountKey");
	visitCount++;
	userID = (String) session.getAttribute("userIDKey");
	session.setAttribute("visitCountKey", visitCount);
%>
<html>
<head>
<title>My Session Tracking Table</title>
</head>
<body>
	<center>
		<h1><%=title%></h1>
	</center>
	<table border="1" align="center">
		<tr bgcolor="red">
			<th>Session Info</th>
			<th>value</th>
		</tr>
		<tr>
			<td>id</td>
			<td>
				<%
					out.print(session.getId());
				%>
			</td>
		</tr>
		<tr>
			<td>Creation Time</td>
			<td>
				<%
					out.print(createTime);
				%>
			</td>
		</tr>
		<tr>
			<td>Last Access</td>
			<td>
				<%
					out.print(lastAccessTime);
				%>
			</td>
		</tr>
		<tr>
			<td>User ID</td>
			<td>
				<%
					out.print(userID);
				%>
			</td>
		</tr>
		<tr>
			<td>Number of Visits</td>
			<td>
				<%
					out.print(visitCount);
				%>
			</td>
		</tr>
	</table>
</body>
</html>