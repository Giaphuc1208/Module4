<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/16/2024
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>EMail</title>
</head>
<body>
<h3>Language: ${mail.language}</h3>
<h3>Page size: ${mail.size}</h3>
<h3>Spam filter: ${mail.spam}</h3>
<h3>Signature: ${mail.signature}</h3>
<button type="submit" onclick="window.location.href='email/update'">Edit</button>
</body>
</html>
