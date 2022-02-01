<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lab 6 - JAVA!</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="image" method="POST" onSubmit>
    <p><select name="select" size="6" multiple>
        <option>Люди</option>
        <option>Животные</option>
        <option>Природа</option>
        <option>Горы</option>
        <option>Машины</option>
    </select>
        <input type="submit" value="Отправить"></p>
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>