<%-- 
    Document   : expresiones
    Created on : 17 abr. 2020, 16:11:22
    Author     : absol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones JSP</title>
    </head>
    <body>
        <h1>Ejemplos expresiones</h1>
        <ul>
            <li> <%= "juan" + " " + "gonzales"  %> </li>
            <li> <%= 3+2+2 %> </li>
            <li> <%= session.getId() %></li>
        <ul/>
        
    </body>
</html>
