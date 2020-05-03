<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Desplegar variables</title>
    </head>
    <body>
        <h1>Desplegar variables del controlador</h1>
        <br/>
        Variable mensaje : ${mensaje}
        <br/>
        <br/>
        <h5> Datos Rectangulo:</h5>
        Altura : ${rectangulo.altura}
        <br/>
        Base : ${rectangulo.base}
        <br/>
        Area : ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
