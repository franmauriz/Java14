package web;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarcliente(request, response);
                    break;
                case "eliminar":
                    this.eliminarcliente(request, response);
                    break;
                default:
                    this.acciondefault(request, response);
            }
        } else {
            this.acciondefault(request, response);
        }

    }

    private void editarcliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCliente = Integer.parseInt(request.getParameter("idcliente"));
        Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
        request.setAttribute("editcliente", cliente);
        String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);

    }

    private void acciondefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("clientes = " + clientes);
        HttpSession session = request.getSession();
        session.setAttribute("clientes", clientes);
        session.setAttribute("totalClientes", clientes.size());
        session.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
        // request.getRequestDispatcher("clientes.jsp").forward(request, response);
        response.sendRedirect("clientes.jsp");
    }
    
    
    private void eliminarcliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idcliente = Integer.parseInt(request.getParameter("idcliente"));
        // creamos objeto cliente
        Cliente cliente = new Cliente(idcliente);
        //insertamos
        int registroModificados = new ClienteDaoJDBC().eliminar(cliente);
        System.out.println("registroModificados = " + registroModificados);
        this.acciondefault(request, response);

    }

    private double calcularSaldoTotal(List<Cliente> clientes) {
        double saldoTotal = 0;
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarcliente(request, response);
                    break;
                case "modificar":
                    this.modificarcliente(request, response);
                    break;
                default:
                    this.acciondefault(request, response);
            }
        } else {
            this.acciondefault(request, response);
        }
    }

    private void insertarcliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        // creamos objeto cliente
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);
        //insertamos
        int registroModificados = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registroModificados = " + registroModificados);
        this.acciondefault(request, response);

    }

    private void modificarcliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idcliente = Integer.parseInt(request.getParameter("idcliente"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        // creamos objeto cliente
        Cliente cliente = new Cliente(idcliente,nombre, apellido, email, telefono, saldo);
        //insertamos
        int registroModificados = new ClienteDaoJDBC().actualizar(cliente);
        System.out.println("registroModificados = " + registroModificados);
        this.acciondefault(request, response);

    }

}
