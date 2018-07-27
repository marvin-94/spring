<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/18
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/register.css"/>">
</head>
<body>

    <!-- 使用spring jsp 标签-->
    <%--<sf:form method="post" modelAttribute="spitter">--%>
        <%--firstName:<sf:input path="firstName"/><sf:errors path="firstName" cssClass="error">请输入4-10长度的名字</sf:errors><br/>--%>
        <%--lastName:<sf:input path="lastName"/><sf:errors path="lastName" cssClass="error">不能为空</sf:errors><br/>--%>
        <%--username:<sf:input path="username"/><sf:errors path="username"/><br/>--%>
        <%--password:<sf:password path="password"/><sf:errors path="password"/><br/>--%>
    <%--<input type="submit" value="注册">--%>
    <%--</sf:form>--%>

    <sf:form method="post" modelAttribute="spitter">
        <sf:errors element="div" path="*" cssClass="error"/>
        firstName:<sf:input path="firstName"/><br/>
        lastName:<sf:input path="lastName"/><br/>
        username:<sf:input path="username"/><br/>
        password:<sf:password path="password"/><br/>
        <input type="submit" value="注册">
    </sf:form>
</body>
</html>
