<%@page isErrorPage="true" %>
<%@page import="java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1> Ocurrio un Error: <%= exception.getMessage() %> </h1>
        <textarea cols="30" rows="5">
        <pre>
            <%  
                exception.printStackTrace(new PrintWriter(out));
            %>
        </pre>
        </textarea>
    </body>
</html>
