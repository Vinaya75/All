<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--<jsp:useBean id="s" class="com.obsqura.Student" />-->
<jsp:setProperty name="s" property="name" value="Vinaya" />
<jsp:setProperty name="s" property="age" value="25" />
<%
    out.println("Bean created successfully");
%>
<br>
Name: <jsp:getProperty name="s" property="name" /><br>
Age:  <jsp:getProperty name="s" property="age" />
</body>
</html>