<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar variables</title>
    </head>
    <body>
        <h1>Listar variables</h1>
        <h3>Alcance Request</h3>
        <h4>Rectangulo:</h4>
        Altura = ${rectangulo.altura}
        Base = ${rectangulo.base}
        Area = ${rectangulo.area}
        <br/>
        <h3>Alcance Session</h3>
        <h4>Rectangulo 2:</h4>
        Altura = ${rectangulo2.altura}
        Base = ${rectangulo2.base}
        Area = ${rectangulo2.area}
        <br/>
        <h3>Alcance Aplicattion</h3>
        <h4>Rectangulo 3:</h4>
        Altura = ${rectangulo3.altura}
        Base = ${rectangulo3.base}
        Area = ${rectangulo3.area}
        <br/><br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
