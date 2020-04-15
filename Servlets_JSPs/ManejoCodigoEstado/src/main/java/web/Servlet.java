package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String usuarioOk="esther";
        String passwordOk="123";
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos:<br/>");
            out.print("Usuario: " + usuario + "<br/>" );
            out.print("Password: " + password + "<br/>" );
            out.print("</h1>");
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Las creadenciales son incorrectas");
        }
        out.close();
    }
    
}
