<%--
  Created by IntelliJ IDEA.
  User: enis
  Date: 26.06.2016
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>

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
        Etiya Odev Ornek Uygulamasi -Ogrenci Ekleme
    </h2>
</div>

<form method="post" action="studentSave">

  Ogrenci Adi:  <input type="text" name="name"><br>
  Ogrenci Soyadi:  <input type="text" name="surname"><br>
  Okul Numarasi:  <input type="text" name="schoolNo"><br>
    <input type="submit"  value="Kaydet" class='btn btn-primary btn-sm'><br>


</form>
</body>
</html>
