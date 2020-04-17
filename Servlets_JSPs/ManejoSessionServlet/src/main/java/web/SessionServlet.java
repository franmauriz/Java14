package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        //pedimos la session
        HttpSession session= request.getSession();
        
        Integer contador = (Integer) session.getAttribute("contadorvisita");
        String titulo = null;
        PrintWriter out = response.getWriter();
        
        if(contador == null){
            contador = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            contador++;
            titulo = "Bienvenido de nuevo";
        }
        
        session.setAttribute("contadorvisita", contador);
        
        out.print(titulo);
        out.print("<br/>");
        out.print("Contador de visitas: " + contador);
        out.print("<br/>");
        out.print("Id Session: " + session.getId());
        out.close();
        
    }
}
