package sga;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class SGA {

    public static void main(String[] args) {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        usuarios = usuarioJDBC.select();
        
        for (Usuario usuario : usuarios) {
            System.out.println("Usuarios: " + usuario);
        }

//        Usuario usuario = new Usuario();
//        usuario.setUsuario("daniel");
//        usuario.setPassword("pizza");
//        
//        usuarioJDBC.insert(usuario);
//          Usuario usuario = new Usuario();
//          usuario.setId_usuario(3);
//          usuario.setUsuario("daniel");
//          usuario.setPassword("spizza");
//          
//          usuarioJDBC.update(usuario);
        Usuario usuario = new Usuario();
        usuario.setId_usuario(1);
        usuarioJDBC.delete(usuario);
        
    }
}
