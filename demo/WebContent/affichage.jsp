<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Bonjour ${param['nom']} </h2>
<c:if test="${param['email'] ne param['email2'] }">
	les emails ne sont pas les mêmes !!
</c:if>
<ul>
<c:forEach begin="1" end="10" var="i" varStatus="st">
	<li>item : ${st.first }</li>
</c:forEach>
</ul>
<body>
</html>