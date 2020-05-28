<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: becky
  Date: 1/27/2020
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Catalog</title>
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

    <button class="add-button" onclick="window.location.href='${cp}/mini/showAddMiniForm'">Add Mini</button>

    <form:form action="search" method="GET">
        Search Minis
        <input type="search" name="searchTerm"/>
        <input type="submit" value="Search" class="add-button">
    </form:form>

    <table>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Category</th>
            <th></th>
        </tr>

        <c:forEach var="tempMini" items="${minis}">


            <c:url var="updateLink" value="mini/showUpdateMiniForm">
                <c:param name="miniId" value="${tempMini.id}"></c:param>
            </c:url>

            <c:url var="deleteLink" value="mini/delete">
                <c:param name="miniId" value="${tempMini.id}"></c:param>
            </c:url>

            <tr>
                <td>${tempMini.name}</td>
                <td>${tempMini.description}</td>
                <td>${tempMini.category.name}</td>
                <td>
                    <a href="${updateLink}">Update</a>
                    <a href="${deleteLink}">Delete</a>
                </td>
            </tr>

        </c:forEach>
    </table>

</div>
</body>
</html>
