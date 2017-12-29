<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-12-29
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>ProductDetails</title>
</head>
<body>
Product Name:<c:out value="${product.name}"/><br/>
Product Discription:<c:out value="${product.discription}"/><br/>
Product Price:<c:out value="${product.price}"/><br/>
<p>Following files are uploaded succefully</p>
<ol>
    <c:forEach items="${product.images}" var="image">
        <li>${image.originalFilename}
            <img src="<c:out value="image/"/>${image.originalFilename}"/>
        </li>
    </c:forEach>
</ol>
</body>
</html>
