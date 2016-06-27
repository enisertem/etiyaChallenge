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
    <script type="text/javascript" src="scripts/jquery.min.js"></script>
    <script type="text/javascript" src="scripts/bootstrap.min.js"></script>
    <script type="text/javascript" src="scripts/pickList.js"></script>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"  rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="scripts/pickList.css">
</head>
<body>

<div class="jumbotron">
    <h2>
        Etiya Odev Ornek Uygulamasi -Ogrenci Listesi
    </h2>
</div>


<table class="table">
    <tr>
        <th>Ad</th>
        <th>Soyad</th>
        <th>Okul No</th>

    </tr>

    <c:forEach var="vars" items="${students}">
        <tr>
            <td>${vars.name}</td>
            <td>${vars.surName}</td>
            <td>${vars.schoollNo}</td>
        </tr>
    </c:forEach>
</table>


<hr>
<a href="addLesson.jsp">Ders ekle</a>
<hr>
<a href="addStudent.jsp">Ogrenci ekle</a>
<hr>
<a href="addRelation">Ogrenci Ders Iliskisi</a>
<hr>
<a href="allLessons">Dersler liste sayfası</a><br>

</body>
</html>
