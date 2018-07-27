<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/7/17
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <form method="post">
        First Name<input type="text" name="firstName"/><br/>
        Last Name<input type="text" name="lastName"/><br/>
        Username<input type="text" name="username"/><br/>
        Password<input type="password" name="password"/><br/>
        <input type="submit" value="Register">
    </form>
</body>
</html>
