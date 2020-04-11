package sga;

import datos.Conexion;
import datos.UsuarioDAO;
import datos.UsuarioDAO_JDBC;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

public class SGA {

    public static void main(String[] args) {
        Connection conexion=null;
        try {
            conexion = Conexion.getConexion();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDAO = new UsuarioDAO_JDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDAO.select();
            for(UsuarioDTO usuario: usuarios){
                System.out.println("itens: " + usuario);
            }
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
        
        
        
    }
}
