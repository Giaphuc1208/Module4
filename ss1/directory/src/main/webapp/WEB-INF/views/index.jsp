
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eng-Vie Dictionary</title>
</head>
<body>
<form action="/translate" method="post">
    <h3>Please enter English word <input type="text" name="word"></h3>
    <button type="submit">Translate</button>
    <h3> Your word is: ${result}</h3>
</form>
</body>
</html>