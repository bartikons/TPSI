<%-- 
    Document   : Lista
    Created on : 6 kwi 2020, 10:06:50
    Author     : naeri
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>stronę odżwiedzono:${sessionScope["licznik"]}</h1>
        <p><a href="/tpsi.labs.lab5/StudentList">StudentList</a></p>
        <p><a href="/tpsi.labs.lab5/Session">F5</a></p>
        <p><a href="/tpsi.labs.lab5/">Back</a></p>
    </body>
</html>
