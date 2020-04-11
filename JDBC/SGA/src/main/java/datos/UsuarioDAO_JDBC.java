package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO_JDBC implements UsuarioDAO{

    private Connection conexion;

    private static final String SQL_SELECT = "SELECT id_usuario,usuario,password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario,password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioDAO_JDBC() {

    }

    public UsuarioDAO_JDBC(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new UsuarioDTO();
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(user);
                usuario.setPassword(password);
                usuarios.add(usuario);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexion == null) {
                Conexion.close(conn);
            }
        }
        return usuarios;
    }

    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Ejecutando query: " + SQL_INSERT);
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexion == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int update(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexion == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexion == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }
}
