<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setHeader("Expires", "0"); // Proxies.
%>
<form action="Loggingin" method="post">
Enter Username<input type="text" name="uname">Username</input><br/>
Enter Password<input type="password" name="password">Password</input><br/>
<input type="submit" value="login">Submit</input><br/>
<jsp:include page="aboutUs.jsp" />


</form>
</body>
</html>