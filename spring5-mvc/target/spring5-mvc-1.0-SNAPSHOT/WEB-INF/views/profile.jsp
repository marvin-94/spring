<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/7/17
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>注册成功</h3>
    <c:out value="${spitter.username}"/><br/>
    <c:out value="${spitter.firstName}"/><br/>
    <c:out value="${spitter.lastName}"/><br/>
</body>
</html>
