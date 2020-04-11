package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    // Recojemos los parametros del formulario
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("El usuario es: " + usuario);
        System.out.println("El password es : " + password);
        
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<body>");
        out.print("<h1>DATOS FORMULARIO</h1>");
        out.print("<b>usuario</b>: " + usuario);
        out.print("<br/>");
        out.print("<b>password</b>: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
