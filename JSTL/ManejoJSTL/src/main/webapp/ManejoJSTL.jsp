<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo JSTL</title>
    </head>
    <body>
        <h1>Manejo JSTL</h1>
        <!-- manipulacion variables -->
        <c:set var="nombre" value="fran"/>
       
        <!-- escribir variable -->
        Valor variable: <c:out value="${nombre}" />
    </body>
</html>
