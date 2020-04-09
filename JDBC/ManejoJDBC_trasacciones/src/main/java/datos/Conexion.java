package datos;

import java.sql.*;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String USER ="absol";
    private static final String PASS = "frandaniel10";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
