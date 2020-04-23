<%
    String colores = request.getParameter("color");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background:<%= colores %>">
       
    </body>
</html>
