<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Variables EL</title>
    </head>
    <body>
        <h1>Variables EL!</h1>
        <br/>
        Nombre Aplicacion= ${pageContext.request.contextPath};
        <br/>
        Navegador = ${header["User-Agent"]};
        <br/>
        Id Session = ${cookie.JSESSIONID.value};
        <br/>
        Web Server = ${pageContext.servletContext.serverInfo};
        <br/>
        Parametro = ${param.usuario};
        <br/><br/>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
