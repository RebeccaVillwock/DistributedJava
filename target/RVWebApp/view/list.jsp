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
<div id="wrapper">

<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="detail.jsp">Details</a></li>
        <li><a href="list.jsp">Catalog</a></li>
        <li><a href="login.jsp">Login</a></li>
    </ul>
</nav>

<h1>Moldy Minis</h1>

<ul>
   <li>Item image</li>
    <li>Another item's image</li>
    <li>More images will follow</li>
</ul>

<button>New Mini</button>
    <form method="get" action="../search">
        Search for mini <input type="text" name="miniName">
        <input type="submit" value="search">
    </form>


</div>
</body>
</html>
