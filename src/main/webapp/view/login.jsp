<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 1/27/2020
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Login</title>
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

<form>
    <label>
        Username: <input type="text" placeholder="rvillwock"/>
    </label>

    <label>
        Password: <input type="text" placeholder="********"/>
    </label>

    <input type="submit" placeholder="Login"/>
</form>

</div>
</body>
</html>
