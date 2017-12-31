<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-12-31
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<div id="global">
    <form:form commandName="user" action="save_user" enctype="multipart/form-data" method="post">
        <fieldset>
            <p>
                <label for="id">User Id:</label>
                <form:input name="id" path="id"/>
            </p>
            <p>
                <label for="name">User Name:</label>
                <form:input name="name" path="name"/>
            </p>
            <p>
                <label for="password">User Password:</label>
                <form:password name="password" path="password"/>
            </p>
            <p>
                User Images:
                <input type="file" name="images[0]"/>
                <input type="reset" tabindex="4" value="reset"/>
                <input type="submit" tabindex="5" value="submit"/>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
