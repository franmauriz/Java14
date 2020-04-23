<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Inclusion Dinamica!</h1>
        <ul>
            <li>
                <jsp:include page="paginas/pag_nombre.jsp" />
            </li>
        </ul>
                <jsp:include page="WEB-INF/pag_privada.jsp" >
                    <jsp:param name="color" value="red" />
                </jsp:include>
           
    </body>
</html>
