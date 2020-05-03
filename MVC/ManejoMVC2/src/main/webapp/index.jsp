<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modelo Vista Controlador dos</title>
    </head>
    <body>
        <h1>Modelo Vista Controlador dos</h1>
        <div style="color: red">${mensaje}</div>
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">Ir al Servlet Controlador sin parametros</a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=cargarvariables">Cargar variables en el scope</a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarvariables">Listar variables en el scope</a>"
    </body>
</html>
