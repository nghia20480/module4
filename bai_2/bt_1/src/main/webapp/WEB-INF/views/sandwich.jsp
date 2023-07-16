
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lựa chọn gia vị với Sandwich</title>
</head>
<body>
<form action="/sandwich/save">
    <input type="checkbox" id="vehicle1" name="condiment" value="Lettuce">
    <label for="vehicle1"> Lettuce</label><br>
    <input type="checkbox" id="vehicle2" name="condiment" value="Tomato">
    <label for="vehicle2"> Tomato</label><br>
    <input type="checkbox" id="vehicle3" name="condiment" value="Mustard">
    <label for="vehicle3"> Mustard</label><br><br>
    <input type="checkbox" id="vehicle4" name="condiment" value="Sprouts">
    <label for="vehicle3"> Sprouts</label><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
