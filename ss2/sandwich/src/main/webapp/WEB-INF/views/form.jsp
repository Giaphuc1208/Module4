
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chọn gia vị cho sandwich của bạn</title>
</head>
<body>
<form action="save" method="post">
    <h2>Chọn gia vị cho Sandwich:</h2>
        <c:forEach var="condiment" items="${condiments}">
            <input type="checkbox" name="condiment" value="${condiment}"/> ${condiment}
        </c:forEach>
    <input type="submit" value="Chọn"/>
</form>
</body>
</html>
