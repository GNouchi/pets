<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>stuff about cats</title>
</head>
<body>
    <a href="Home">Home</a>
    <h2> You created a <c:out value="${cat.breed}"/> </h2>
    <p>
        <c:out value="${cat.showAffection()}"/>
    </p>
</body>
</html>