<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 5/28/2020
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Mini Form</title>
</head>
<body>

<form:form action="${cp}/mini/save" modelAttribute="aMini" method="post" enctype="multipart/form-data">
    <form:hidden path="id" value="${aMini.id}"/>
    <form:hidden path="miniDescription" value="${aMini.miniDescription}"/>

    <table>
        <tr>
            <td><label>Name</label></td>
            <td>
                <form:input path="name"/>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>

        <tr>
            <td><label>Description</label></td>
            <td>
                <form:input path="description"/>
                <form:errors path="description" cssClass="error"/>
            </td>
        </tr>

        <tr>
            <td><label>Categories</label></td>
            <td>
                <form:select path="category" items="${categories}" itemLabel="name" itemValue="id"></form:select>
            </td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save" class="save"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
