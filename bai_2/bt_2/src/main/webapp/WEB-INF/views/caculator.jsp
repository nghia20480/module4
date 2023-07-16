<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>CACULATOR</h1>
<form action="/caculator/result">
  <input type="number" name="first">
  <input type="number" name="second">
  <input type="submit" name="active" value="Addition(+)">
  <input type="submit" name="active" value="Subtraction(-)">
  <input type="submit" name="active" value="Multiplication(x)">
  <input type="submit" name="active" value="Division(/)">
</form>
</body>
</html>
