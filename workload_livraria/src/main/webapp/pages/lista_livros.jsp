<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros</title>
</head>
<body>
	<h1>Livros cadastrados</h1>
	</br>
	<c:forEach items="${livros}" var="livro">
		<b>Título: </b>
		<c:out value="${livro.titulo}" />
		<br>
	</c:forEach>

</body>
</html>