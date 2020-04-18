<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriplets Jps</title>
    </head>
    <body>
        <h1>Scriplets Jps!</h1>
        <% out.print("Hola desde un Scriplet"); %>
        <h1>Nombre Aplicacion:</h1>
        <% String nombre = request.getContextPath(); 
         out.print("Nombre:" + nombre); %>
        <h1>Condicional</h1>
        <% if(session != null && session.isNew()){ %>
        
        <h5>La se si es nueva</h5>
        
        <% }else if(session!=null){ %>
        
         <h5>La no esnull nueva</h5>
        
        <% } %>
    </body>
</html>
