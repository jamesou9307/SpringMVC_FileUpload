<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-12-29
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<! DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<div id="global">
    <%--设置ennctype用于文件传输--%>
    <form:form commandName="product" action="save_product" method="post" enctype="multipart/form-data">

        <fieldset>

            <legend>Add a Product</legend>
            <p>
                <label for="name">Product Name:</label>
                <form:input id="name" path="name"/>
            </p>
            <p>
                <label for="discription">Discription:</label>
                <form:input id="discription" path="discription" />
            </p>
            <p>
                <label for="price">Price:</label>
                <form:input id="price" path="price"/>
            </p>
            <p>
                Product Image:<br/>
                <input type="file" name="images[0]"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" value="reset"/>
                <input id="submit" type="submit" tabindex="5" value="submit"/>
            </p>
        </fieldset>

    </form:form>
</div>

</body>
</html>
