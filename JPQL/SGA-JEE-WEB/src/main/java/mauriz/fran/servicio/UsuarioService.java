package mauriz.fran.servicio;

import java.util.List;
import javax.ejb.Local;
import mauriz.fran.dominio.Usuario;

@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuario();
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    public Usuario encontrarUsuarioPorNombre(Usuario usuario);
    public void insertarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}
