<%-- 
    Document   : studentList
    Created on : 6 kwi 2020, 10:53:56
    Author     : naeri
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>imie</th>
                <th>Nazwisko</th>
                <th>e-mail</th>
            </tr>
        <c:forEach items='${sessionScope["Lista_studentow"]}' var="student">
            <tr>
                <th>${student.firstName}</th>
                <th>${student.lastName}</th>
                <th>${student.emailAddress}</th>
            </tr>
        </c:forEach>
            </table>
        
        <form action='/tpsi.labs.lab5/StudentList' method='Post'>
            Przedstaw się ładnie:
            <input type='text' name='imie'>
            <input type='text' name='nazwisko'>
            <input type='text' name='email'>
            <input type='text' name='id'>
            <input type='submit'>
        </form>
        <p><a href="/tpsi.labs.lab5/Session">Licznik odwiedzin</a></p>
        <p><a href="/tpsi.labs.lab5/">Back</a></p>
    </body>
</html>
