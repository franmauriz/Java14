package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletCabeceros")
public class ServletCabeceros extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        String metodoHTTP = request.getMethod();
        String uri_HTTP = request.getRequestURI();
        Enumeration cabeceros = request.getHeaderNames();
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Datos de la cabecera Http</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Datos Headers HTTP</h1>");
        out.print("<b>Metodo:</b>" + metodoHTTP);
        out.print("</br>");
        out.print("<b>URI:</b>" + uri_HTTP);
        out.print("</br>");
        out.print("</br>");
        while(cabeceros.hasMoreElements()){
            String cabecero = (String) cabeceros.nextElement();
            out.print("<b>"+ cabecero +": </b>");
            out.print(request.getHeader(cabecero));
            out.print(cabecero + "<br/></br>");
        }
        out.print("</body></html>");
        out.close();
    }
    
}
