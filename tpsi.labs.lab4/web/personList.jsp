<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
        <c:forEach items="${personli}" var="person">
            <tr>
                <th>${person.firstName}</th>
                <th>${person.lastName}</th>
                <th>${person.emailAddress}</th>
            </tr>
        </c:forEach>
            </table>
    </body>
</html>
