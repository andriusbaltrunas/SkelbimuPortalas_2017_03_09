<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 3/10/2017
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advert detail page</title>
</head>
<body>

  <c:if test="${not empty advert}">
    <table>
      <tr>
        <td>Aprasymas:</td>
        <td>${advert.description}</td>
      </tr>
      <tr>
        <td>Miestas:</td>
        <td>${advert.city}</td>
      </tr>
      <tr>
        <td>Pastas:</td>
        <td>${advert.email}</td>
      </tr>
      <tr>
        <td>Telefonas:</td>
        <td>${advert.phone}</td>
      </tr>
      <tr>
        <td>Galioja iki:</td>
        <td>${advert.activeTime}</td>
      </tr>
      <tr>
        <td>Kaina:</td>
        <td style="font-size: 20px">${advert.price}Eu</td>
      </tr>
    </table>

  </c:if>

</body>
</html>
