<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Atributos</title>
    </head>
    <body>
        <h1>Modificar Atributos!</h1>
        <jsp:useBean id="rectangulo" scope="session" class="web.Rectangulo" />
        <% 
            int altura = 10;
            int base = 5;
        %>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=altura%>" />
        <jsp:setProperty name="rectangulo" property="base" value="<%=base%>" />
        
        <h5>Atributos Modificados</h5>
        Altura: <%= altura %>
        <br/>
        Base: <%= base %>
        <br/>
        <br/>
        <a href="index.jsp">Volver al inicio</a>
    </body> 
</html>
