package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        List<String> articulos = (List<String>) session.getAttribute("articulos");
        
        String articulo = request.getParameter("articulo");
        
        PrintWriter out = response.getWriter();
        
        if(articulos == null){
            articulos = new ArrayList<>();
            session.setAttribute("articulos", articulos);
        }
        
        if(articulo != null && !articulo.trim().equals("")){
            articulos.add(articulo);
        }
        
        out.print("<h1>Lista articulos</h1>");
        out.print("<br/>");
        out.print("<ul>");
        for(String a : articulos){
            out.print("<li>" + a + "</li>");
        }
        out.print("</ul>");
        out.print("<br/>");
        out.print("<a href='/CarritoSession'/>Regresar al inicio</a>");
        out.close();
        
        
    }
}