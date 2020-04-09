package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;

public class ManejoPersonas {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        try {
            conn = Conexion.getConexion();
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            PersonaJDBC personaJDBC = new PersonaJDBC(conn);
//            Persona persona = new Persona();
//            persona.setNombre("fran");
//            persona.setApellido("mauriz");
//            persona.setEmail("fran@server.com");
//            persona.setTelefono("123456");
//            personaJDBC.insert(persona);
            
            Persona persona2 = new Persona();
            persona2.setId_persona(1);
            persona2.setNombre("Roberto");
            persona2.setApellido("Mauriz");
            
            personaJDBC.update(persona2);
            
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
