package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1º procesamos parametros
        String accion = request.getParameter("accion");

        // 2º Creamos los javabeans
        Rectangulo rectangulo = new Rectangulo(3, 10);
        Rectangulo rectangulo2 = new Rectangulo(4, 2);
        Rectangulo rectangulo3 = new Rectangulo(5, 10);

        // 3º Agregamos el javabeans algun alcance
        if ("cargarvariables".equals(accion)) {
            request.setAttribute("rectangulo", rectangulo);

            HttpSession session = request.getSession();

            session.setAttribute("rectangulo2", rectangulo2);

            ServletContext application = this.getServletContext();
            application.setAttribute("rectangulo3", rectangulo3);

            request.setAttribute("mensaje", "Las variables se han cargado");

            // 4º Redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);

        } else if ("listarvariables".equals(accion)) {
            // 4º Redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/listarvariables.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("mensaje", "No se han pasado ninguna variable");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

    }
}
