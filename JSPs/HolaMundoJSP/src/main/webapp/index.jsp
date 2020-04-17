<%-- 
    Document   : index
    Created on : 17 abr. 2020, 7:09:40
    Author     : absol
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo</title>
    </head>
    <body>
        <h1>Hola Mundo desde JSPs!</h1>
        <ul>
            <li> <% out.print("Hola Mundo con Scriptlest"); %> </li>
            <li> ${"Hola mundo con Expressin Languaje EL"}</li>
            <li> <%= "Hola mundo con expresiones" %></li>
            <li> <c:out value="Hola mundo con JSTL" /></li>
        </ul>
    </body>
</html>
