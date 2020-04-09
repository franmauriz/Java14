package datos;

import java.sql.*;

public class Conexion {

    private static final String SQL_URL = "jdbc:mysql://localhost/sga?useSSL=false&serverTimezone=UTC";
    private static final String SQL_USER = "absol";
    private static final String SQL_PASS = "frandaniel10";

    public static Connection getConexion() throws SQLException {

        return DriverManager.getConnection(SQL_URL, SQL_USER, SQL_PASS);

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
