<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 3/9/2017
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Advert results</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty adverts}">
            netuscias
        </c:when>
        <c:otherwise>
            na jis yra tuscias
        </c:otherwise>
    </c:choose>
</body>
</html>
