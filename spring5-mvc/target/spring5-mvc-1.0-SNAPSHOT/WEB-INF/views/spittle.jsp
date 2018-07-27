<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/7/11
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/resources/style.css"/>"/>
</head>
<body>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="spittle.id"/>"></li>
        <div>
            <c:out value="${spittle.message}"/>
        </div>
        <div>
            <span><c:out value="${spittle.time}"/></span>
            <span>(<c:out value="${spittle.latitude}"/>,<c:out value="${spittle.longitude}"/>)</span>
        </div>
    </c:forEach>
</body>
</html>