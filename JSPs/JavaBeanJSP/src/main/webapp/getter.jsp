<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Obtener atributos</title>
    </head>
    <body>
        <h1>Obtener Atributos!</h1>
        <jsp:useBean id="rectangulo" class="web.Rectangulo" scope="session"/>
        Altura : <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        <br/>
        Base : <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        <br/>
        Area : <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        <br/>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
