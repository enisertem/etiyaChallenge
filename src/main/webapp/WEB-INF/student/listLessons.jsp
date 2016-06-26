<%--
  Created by IntelliJ IDEA.
  User: enis
  Date: 26.06.2016
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>Ders Ad</th>
        <th>Ders No</th>
        <th>Ders Kredi</th>
    </tr>

    <c:forEach var="vars" items="${lessons}">
        <tr>
            <td>${vars.lessonName}</td>
            <td>${vars.lessonNumber}</td>
            <td>${vars.lessonKredit}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
