package ejemplo.jdbc;

import java.sql.*;

public class IntroduccionJDBC {
    public static void main(String[] args) {
        // 1º paso. crear la cadena de conexion a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            // 2º paso. crear el obejto de conexion a mysql
            Connection conexion = DriverManager.getConnection(url, "ptl28sev000", "frandaniel10");
            // 3º paso . crear el statament
            Statement instrucciones = conexion.createStatement();
            // 4º paso crear la query
            String sql = "select id_persona,nombre,apellido,email,telefono from persona";
            // 5º paso ejecutar query
            ResultSet resultado = instrucciones.executeQuery(sql);
            // 6º paso, procesamos resultado
            while(resultado.next()){
                System.out.println("id_persona: " + resultado.getInt(1));
                System.out.println("nombre: " + resultado.getString(2));
                System.out.println("apellido: " + resultado.getString(3));
                System.out.println("email: " + resultado.getString(4));
                System.out.println("telefono: " + resultado.getString(5));
            }
            // 7º paso cerramos los obejos
            resultado.close();
            instrucciones.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
