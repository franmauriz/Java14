package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        boolean usuarioNuevo = true;
        String mensaje = null;
        PrintWriter out = response.getWriter();
        
        Cookie cookies[] = request.getCookies();
        
        if(cookies!=null){
            for(Cookie c : cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    usuarioNuevo=false;
                }
            }
        }
        
        if(usuarioNuevo){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);
            mensaje = "Bienvenido al sitio web.com, esperemos que tu primera visita te guste";
            out.print(mensaje);
        }else{
            mensaje = "Bienvenido de nuevo al sitio web.com, Nos agrada tu vuelta";
            out.print(mensaje);
        }
        out.close();
        
    }
}
