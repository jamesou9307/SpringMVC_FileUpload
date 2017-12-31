<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-12-31
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Details</title>
</head>
<body>
user Id:<c:out value="${user.id}"/><br/>
user Name:<c:out value="${user.name}"/><br/>
user Image:
<c:forEach items="${user.images}" var="image">
    ${image.originalFilename} <img src="image/<c:out value="${image.originalFilename}"/>"/>
</c:forEach>
</body>
</html>
