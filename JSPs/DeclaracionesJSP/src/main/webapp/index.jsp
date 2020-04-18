<%!
    String usuario = "fran";
    
    public String getUsuario(){
        return this.usuario;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones JSP</title>
    </head>
    <body>
        <h1>Declaraciones JSP</h1>
        <h3>Obtenemos el usuario a traves del metodo de una declaracion : <%= this.getUsuario() %></h3>
        <h3>Obtenemos el usuario a traves de una variable de una declaracion : <%= this.usuario %></h3>
    </body>
</html>
