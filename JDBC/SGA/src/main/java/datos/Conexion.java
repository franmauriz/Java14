package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String SQL_URL = "jdbc:mysql://localhost/sga?useSSL=false&serverTimezone=UTC";
    private static final String SQL_USER = "absol";
    private static final String SQL_PASS = "frandaniel10";
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(SQL_URL);
        ds.setUsername(SQL_USER);
        ds.setPassword(SQL_PASS);
        //inicializamos el tañano incial del pool
        ds.setInitialSize(5);
        return ds;
    }
    

    public static Connection getConexion() throws SQLException {

        return getDataSource().getConnection();

    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
