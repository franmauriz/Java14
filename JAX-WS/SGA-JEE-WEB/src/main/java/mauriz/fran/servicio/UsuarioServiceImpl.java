package mauriz.fran.servicio;

import java.util.List;
import javax.inject.Inject;
import mauriz.fran.datos.UsuarioDao;
import mauriz.fran.dominio.Usuario;

public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote{

    @Inject
    private UsuarioDao usuarioDao;
    
    @Override
    public List<Usuario> listarUsuario() {
        return usuarioDao.findAllUser();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDao.findById(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorNombre(Usuario usuario) {
        return usuarioDao.findByUsername(usuario);
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        usuarioDao.insertUser(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.updateUser(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.deleteUser(usuario);
    }
    
    
    
}
