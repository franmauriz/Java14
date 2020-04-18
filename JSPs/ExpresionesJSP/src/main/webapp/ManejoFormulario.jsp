<%-- 
    Document   : ManejoFormulario
    Created on : 17 abr. 2020, 16:11:51
    Author     : absol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo Formulario</title>
    </head>
    <body>
        <h1>Datos Formularios!</h1>
        <h5>Usuario: <%= request.getParameter("usuario") %></h5>
        <h5>Paswword: <%= request.getParameter("pass") %></h5>
                
    </body>
</html>
