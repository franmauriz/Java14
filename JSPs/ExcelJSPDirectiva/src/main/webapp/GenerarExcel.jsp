<%@page errorPage="WEB-INF/Error.jsp"  %>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombre = "report.xlsx";
    response.setHeader("Content-Disposition","inline;filename=" + nombre);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reporte Excel</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>
                    Fran
                </td>
                <td>
                    Mauriz
                </td>
                <td> 
                    <%= Conversiones.forma("500") %>
                </td>
            </tr>
            <tr>
                <td>
                    Esther
                </td>
                <td>
                    Jaime
                </td>
                <td> 
                    <%= Conversiones.forma(new Date()) %>
                </td>
            </tr>
        </table>
    </body>
</html>
