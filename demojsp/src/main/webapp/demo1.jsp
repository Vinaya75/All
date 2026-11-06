<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Number and squares</h1>
<table border ="5">
<tr>
<th>Number</th>
<th>Square</th>
</tr>

<%
for(int i=1;i<=10;i++){
%>
<tr>
<td>
<%=i %>
</td>
<td>
<%=i*i %>
</td>
</tr>
<%} %>
</table>
</body>
</html>