<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 6/30/2023
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="student" action="/student/create" method="post">
    ID
    <form:input path="id"/><br>
    Name
    <form:input path="name"/><br>
    Gender
    <form:select path="gender">
        <form:option value="1">Nam</form:option>
        <form:option value="0">Nữ</form:option>
        <form:option value="-1">LGBT</form:option>
    </form:select>
<%--    <form:radiobutton path="gender" value="1"/>Nam--%>
<%--    <form:radiobutton path="gender" value="0"/>Nữ--%>
<%--    <form:radiobutton path="gender" value="-1"/>LGBT<br>--%>
    Languages
    <form:checkboxes items="${languages}" path="languages"/>
    <button>Save</button>
</form:form>

</body>
</html>
