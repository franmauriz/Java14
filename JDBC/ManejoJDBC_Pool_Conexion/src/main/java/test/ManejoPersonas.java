package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDAO_JDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class ManejoPersonas {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        try {
            conn = Conexion.getConexion();
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            PersonaDAO personaDAO = new PersonaDAO_JDBC(conn);
            List<PersonaDTO> personas = personaDAO.select();
            
            for(PersonaDTO persona : personas){
                System.out.println("Items: " + persona);
            }
            
            
            conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
    
}
