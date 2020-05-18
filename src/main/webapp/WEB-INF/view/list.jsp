<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 1/27/2020
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Catalog</title>
</head>
<body>
<c:url value="/desiredMini" var="actionURL"/>
<div id="wrapper">

<nav>
    <ul>
        <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="<c:url value="miniForm"/>">Catalog</a></li>
        <li><a href="<c:url value="detail"/>">Details</a></li>
        <li><a href="<c:url value="login"/>">Login</a></li>
    </ul>
</nav>

<h1>Moldy Minis</h1>

<ul>
   <li>Item image</li>
    <li>Another item's image</li>
    <li>More images will follow</li>
</ul>

<button>New Mini</button>
    <form:form action="${actionURL}" modelAttribute="bindingMini">
        Search for mini <form:input path="miniName"/>
        <input type="submit" value="search">
    </form:form>


</div>
</body>
</html>
