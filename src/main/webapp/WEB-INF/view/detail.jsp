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
    <title>Detail</title>
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

<form>
    <label>Name: <input type="text"value="Item Image's name"/></label>
    <label>Price: <input type="text" value ="$8.00"/></label>
    <label>Category: <input type="text" value="beast"/></label>
    <input type="submit" value="save"/>
</form>

</div>
</body>
</html>
