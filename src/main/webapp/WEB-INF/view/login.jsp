<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 1/27/2020
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Login</title>
</head>
<body>
<div id="wrapper">

<nav>
    <ul>
        <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="<c:url value="mini/list"/>">Catalog</a></li>
        <li><a href="<c:url value="mini/detail"/>">Details</a></li>
        <li><a href="<c:url value="mini/login"/>">Login</a></li>
    </ul>
</nav>

<h1>Moldy Minis</h1>

    <form:form action="${cp}/authenticate" method="post">
        <table>
            <tr>
                <td><label>Username</label></td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Login"></td>
            </tr>
            <c:if test="${param.error != null}">
                <td></td>
                <td class="error"> Invalid login</td>
            </c:if>
        </table>
    </form:form>

</div>
</body>
</html>