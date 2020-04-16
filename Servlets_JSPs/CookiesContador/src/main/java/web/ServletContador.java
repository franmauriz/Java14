package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ServletContador")
public class ServletContador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        int contador = 0;
        PrintWriter out = response.getWriter();
        
        Cookie cookies[] = request.getCookies();
        
        if(cookies!=null){
            for(Cookie c: cookies){
                if(c.getName().equals("contadorCookie")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        contador++;
        
        Cookie c = new Cookie("contadorCookie",Integer.toString(contador));
        c.setMaxAge(3600);
        response.addCookie(c);
        
        response.setContentType("text/html;charset=UTF-8");
        
        out.print("Contador de visitas: " + contador);
        
    }
}
