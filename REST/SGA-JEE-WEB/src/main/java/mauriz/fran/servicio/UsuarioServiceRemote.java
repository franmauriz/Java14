package mauriz.fran.servicio;

import java.util.List;
import javax.ejb.Remote;
import mauriz.fran.dominio.Usuario;

@Remote
public interface UsuarioServiceRemote {
    
    public List<Usuario> listarUsuario();
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    public Usuario encontrarUsuarioPorNombre(Usuario usuario);
    public void insertarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}