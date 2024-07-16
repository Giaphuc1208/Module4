<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/16/2024
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>EMail Box Settings</title>
</head>
<body>
<%--@declare id="spam"--%><h2>Update Mailbox Settings</h2>

<%--@elvariable id="emailSettings" type=""--%>
<form:form method="post" modelAttribute="emailSettings" action="/email/update">
    <label for="language">Language:</label>
    <form:select path="language">
        <form:options items="${languages}" />
    </form:select>
    <br><br>

    <label for="size">Page size:</label>
    <form:select path="size">
        <form:options items="${sizes}" />
    </form:select>
    <br><br>

    <label for="spam">Spam filter:</label>
    <form:checkbox path="spam" />
    <br><br>

    <label for="signature">Signature:</label>
    <form:textarea path="signature" />
    <br><br>

    <input type="submit" value="Save">
</form:form>
</body>
</html>
