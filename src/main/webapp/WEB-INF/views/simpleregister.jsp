<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form method="POST" action="register" modelAttribute="user">
<table>
    <tr>
        <td>First Name :</td>
        <td><form:input path="FirstName" /></td>
    </tr>
     <tr>
        <td>Last Name :</td>
        <td><form:input path="LastName" /></td>
    </tr>
    <form:hidden path="userrole" value="ADMIN" />
     <tr>
        <td>Email :</td>
        <td><form:input path="${user.userCredentials.email}" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="${user.userCredentials.password}" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>

</body>
</html>