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
<%@include file="login.jsp"%>
    <div style="margin-top: 200px;  position: absolute;">
        <c:choose>
            <c:when test="${not empty adverts}">
                <table>
                    <thead>
                        <tr>
                            <th>Aprasymas</th>
                            <th>Miestas</th>
                            <th>Kaina</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${adverts}" var="advert">
                            <tr>
                                <td><a href="/advertDetail?id=${advert.id}">${advert.shortDescription}</a></td>
                                <td>${advert.city}</td>
                                <td>${advert.price}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                na jis yra tuscias
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
