package mauriz.fran.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mauriz.fran.dominio.Usuario;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao {
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;
    
    @Override
    public List<Usuario> findAllUser() {
       return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public Usuario findByUsername(Usuario usuario) {
        return em.find(Usuario.class, usuario.getUsername());
    }

    @Override
    public void insertUser(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUser(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUser(Usuario usuario) {
        em.remove(em.merge(usuario));
    }
    
}
