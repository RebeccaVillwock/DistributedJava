<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 1/27/2020
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Home</title>
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
<img src="../resources/img/Moldy-Minis-Logo.jpg">
<p>Search through the catalog and find a mini that brings you joy.</p>

</div>
</body>
</html>
