<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setHeader("Expires", "0"); // Proxies.
%>
<%

if(session.getAttribute("unamelabel")==null)
{
	response.sendRedirect("login.jsp");
}

%>
Welcome ${unamelabel}
<a href="videos.jsp">Videos click here</a>
<form action="Loggingout">
	Logout: <input type="submit" value="Logout">
</form>
<jsp:include page="aboutUs.jsp" />

</body>
</html>