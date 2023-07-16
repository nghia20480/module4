<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>CACULATOR</h1>
<form action="/caculator/result">
  <input type="number" name="first" value="${first}">
  <input type="number" name="second" value="${second}">
  <input type="submit" name="active" value="Addition(+)">
  <input type="submit" name="active" value="Subtraction(-)">
  <input type="submit" name="active" value="Multiplication(x)">
  <input type="submit" name="active" value="Division(/)">
</form>
<c:if test="${active == 'Addition(+)'}">
  <p> Result Addition(+): ${result}  </p>
</c:if>
<c:if test="${active == 'Subtraction(-)'}">
  <p> Result Subtraction(-): ${result}  </p>
</c:if>
<c:if test="${active == 'Multiplication(x)'}">
  <p> Result Multiplication(x): ${result}  </p>
</c:if>
<c:if test="${active == 'Division(/)'}">
  <p> Result Division(/): ${result}  </p>
</c:if>
</body>
</html>
