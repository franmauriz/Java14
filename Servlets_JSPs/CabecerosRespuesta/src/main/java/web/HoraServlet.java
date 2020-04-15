package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("reresh", "1");
        Date fecha = new Date();
        SimpleDateFormat  formato = new SimpleDateFormat("'Hora actualizada:' HH:mm:ss");
        String horaformato = formato.format(fecha);
        
        out.print("<h1>" + horaformato + "</h1>");
        out.close();
        
    }
}
