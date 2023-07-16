<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 7/9/2023
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CONVERT</title>
</head>
<body>
<h1>Chuyen doi VND sang USD</h1>
<form action="/convert1" method="get">
    <input name="VND" placeholder="Nhap so tien VND">
    <button type="submit">Chuyen doi</button>
</form>
<span>So tien cua ban se la: </span>${USD}<span> USD</span>
</body>
</html>
