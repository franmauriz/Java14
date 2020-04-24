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
        <br/>
        <!-- Variable con codigo hatml -->
        Variable con codigo hatml: <c:out value="<h4>Variable con HTML</h4>" escapeXml="false"/>
        <br/>
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            Esto solo se imprime si la bandera es true.
        </c:if>
        <br/>
        <c:if test="${param.opcion != null}" >
            <c:choose> 
                <c:when test="${param.opcion == 1}">
                    La variable opcion vale 1
                </c:when>
                <c:when test="${param.opcion == 2 }" >
                    La variable opcion vale 2
                </c:when>
                <c:otherwise>
                    la variable opcion tiene un valor desconocido : ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <br/>
        <% 
            String nombres[] = {"Fran","Esther","Roberto","Daniel"};
            request.setAttribute("nombres", nombres );
        %>
        <ul>
        <c:forEach var="nomes" items="${nombres}">
            <li>${nomes}</li>
        </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
