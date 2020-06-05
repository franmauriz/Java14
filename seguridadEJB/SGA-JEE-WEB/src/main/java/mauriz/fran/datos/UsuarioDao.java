package mauriz.fran.datos;

import java.util.List;
import mauriz.fran.dominio.Usuario;

public interface UsuarioDao {
    public List<Usuario> findAllUser();
    public Usuario findById(Usuario usuario);
    public Usuario findByUsername(Usuario usuario);
    public void insertUser(Usuario usuario);
    public void updateUser(Usuario usuario);
    public void deleteUser(Usuario usuario);
}
