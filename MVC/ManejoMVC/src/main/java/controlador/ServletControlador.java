package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        // 1º procesamos parametros
        
        // 2º Creamos los javabeans
        Rectangulo rectangulo = new Rectangulo(3,10);
        
        // 3º Agregamos el javabeans algun alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet Controlador");
        
        HttpSession session = request.getSession();
        
        session.setAttribute("rectangulo", rectangulo);
        
        // 4º Redireccionar a la vista seleccionada
        
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarvariables.jsp");
        rd.forward(request, response);
        
     }
}
