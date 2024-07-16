
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Gia vị đã chọn</title>
</head>
<body>
<h2>Gia vị đã chọn:</h2>
<ul>
    <c:forEach var="condiment" items="${selected}">
        <li>Bạn đã chọn ${condiment},làm gia vị cho bánh sandwich của mình</li>
    </c:forEach>
</ul>
</body>
</html>