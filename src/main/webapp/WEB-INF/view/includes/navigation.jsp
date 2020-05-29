<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav>
    <ul>
        <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="<c:url value="mini/list"/>">Catalog</a></li>
        <li><a href="<c:url value="mini/detail"/>">Details</a></li>
        <li><a href="<c:url value="mini/login"/>">Login</a></li>
        <li>
            <c:choose>
                <c:when test="${pageContext.request.userPrincipal != null}">
                    <a href="${cp}/logout">Logout</a><br/>
                    ${pageContext.request.userPrincipal.name}
                </c:when>
                <c:otherwise>
                    <a href="${cp}/showLoginForm">Login</a>
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</nav>
