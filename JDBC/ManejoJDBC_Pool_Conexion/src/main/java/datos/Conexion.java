package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String USER ="absol";
    private static final String PASS = "frandaniel10";
    
   public static DataSource getDataSource(){
       BasicDataSource ds = new BasicDataSource();
       ds.setUrl(URL);
       ds.setUsername(USER);
       ds.setPassword(PASS);
       //iniciamos el tamaño inical del pool a 5 conexiones
       ds.setInitialSize(5);
       return ds;
   }
    
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
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
