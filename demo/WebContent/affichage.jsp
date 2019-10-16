<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String nom = request.getParameter("nom");
	String email = request.getParameter("email");
	String email2 = request.getParameter("email2");
	String objet = request.getParameter("objet");
	String message = request.getParameter("message");
%>
<h2>Bonjour <%=nom%> </h2>
<%
	boolean ok = email.equals(email2);
if(!ok) {
%>
	<h4>Votre email est faux</h4>
<% 
}
%>
</body>
</html>