<%--
  Created by IntelliJ IDEA.
  User: enis
  Date: 26.06.2016
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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


<form action="studentsLessonsSubmit" method="get">

    <select name="student" id="students">
        <c:forEach var="vars" items="${students}">
            <option value="${vars.id}">${vars.name} - ${vars.surName} </option>
        </c:forEach>
    </select>
    <input type="submit" value="ogrencinin derslerini getir >>>>">

</form>


    <div id="pickList"></div>
    <script type="text/javascript">
        var entityMap = {
            "&": "&amp;",
            "<": "&lt;",
            ">": "&gt;",
            '"': '&quot;',
            "'": '&#39;',
            "/": '&#x2F;'
        };

        function escapeHtml(string) {
            return String(string).replace(/[&<>"'\/]/g, function (s) {
                return entityMap[s];
            });
        }
        var val = {
        <c:forEach var="vars" items="${allLessons}">
        ${vars.id}:
        {
            id: ${vars.id},
            text: '${vars.lessonName}'
        }
        ,
        </c:forEach>
        };
        var pick = $("#pickList").pickList({data: val});



        function chekli() {
            <c:forEach var="vars" items="${studentLessons}">

            var p = $("#pickData  option[id=" + ${vars.id} +"]");

            // $("#pickData option[value=" + ${vars.id} +"]")  //   var p = pickThis.find("#pickData option:selected");

            p.clone().appendTo("#pickListResult");
            p.remove();

            </c:forEach>
        }


    </script>
<form id="target" method="post">
    <input type="hidden" id="hidVals" name="secilen" value="">
    <input type="hidden" id="hidValsSid" name="sid" value="">
    <input type="submit"  value="kaydet">

</form>
<script type="text/javascript">



    $( "#target" ).submit(function( event ) {
        var txt='';
        $.each(  pick.getValues(), function (i, v) {
            console.log(v.id);
            txt+= v.id+'-';

        });


        $("#hidVals").val(txt);
        $("#hidValsSid").val(<%= request.getParameter("student") %>);

    });

    chekli();
</script>
<br>
<hr>
<a href="allStudentSave">Ogrenci liste sayfası</a>
<hr>
<a href="allLessons">Dersler liste sayfası</a>
<hr>
<a href="addLesson.jsp">Ders ekle</a>
<hr>
<a href="addStudent.jsp">Ogrenci ekle</a>
<hr>



</body>
</html>
