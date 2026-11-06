<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
</head>
<body>
<h1>Student Registration form</h1>
<form action="RegistrationsServlet" method="post">
<table>
<tr>
<td>Rollno</td>
<td><input type="text" name="rollno"/></td>
</tr>
<tr>
<td>Student name</td>
<td><input type="text" name="sname"/></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" value="male" name="Gender">Male
<input type="radio" value="female" name="Gender">Female
<input type="radio" value="others" name="Gender">others</td>
</tr>
<tr>
<td>Course</td>
<td><select name="course">
<option>Selenium with Java</option>
<option>Playwright with js ts</option>
<option>Selenium with Python</option>
<option>Mern</option>
</select></td>
</tr>
<tr>
<td>Address</td>
<td><textarea name="addr"></textarea></td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="Register">
</td>
</tr>

</table>
</form>
</body>
</html>