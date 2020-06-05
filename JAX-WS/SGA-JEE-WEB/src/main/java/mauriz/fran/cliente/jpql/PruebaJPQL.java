package mauriz.fran.cliente.jpql;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mauriz.fran.dominio.Persona;
import mauriz.fran.dominio.Usuario;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        String jpql = null;
        Persona persona=null;
        List<Persona> personas=null;
        Query q=null;
        Iterator iter=null;
        Object[] tupla = null;
        List<String> nombres=null;
        List<Usuario> usuarios=null;
        

        //jpql = "select p from Persona p";

        //List<Persona> personas = em.createQuery(jpql).getResultList();

        //mostrarConsulta(personas);
        
        //jpql="select p from Persona p where p.idPersona=1";
        //persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug("Persona: " + persona);
        
        //jpql="select p from Persona p where p.nombre='dani'";
        //personas= em.createQuery(jpql).getResultList();
        //mostrarConsulta(personas);
        
        jpql="select p.nombre, p.apellido, p.email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("nombre: " + nombre + " apellido: " + apellido + " email: " + email);            
        }
        
        jpql="select max(p.idPersona) ,min(p.idPersona), count(p.idPersona) from Persona p";
        iter= em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            Integer maxId= (Integer) tupla[0];
            Integer minId= (Integer) tupla[1];
            Long contador = (Long) tupla[2];
            //log.debug("maxId: " + maxId + ", minId: " + minId + ", contador: " + contador);
        }
        
        
        jpql="select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        log.debug("contador: " + contador);
        
        jpql="select CONCAT(p.nombre,' ',p.apellido) as Nombre from Persona p";
        nombres=em.createQuery(jpql).getResultList();
        for(String nombre: nombres){
            //log.debug("Nombre: " + nombre.toUpperCase());
        }
        
        
        int id=1;
        jpql="select p from Persona p where p.idPersona = :id";
        q=em.createQuery(jpql);
        q.setParameter("id", id);
        persona=(Persona) q.getSingleResult();
        //log.debug("Persona: " + persona);
        
        jpql = "select p from Persona p where upper(p.nombre) like upper(:letra) order by p.nombre";
        String letra="%a%";
        q = em.createQuery(jpql);
        q.setParameter("letra", letra);
        personas= q.getResultList();
        //mostrarConsulta(personas);
        
        jpql="select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1)";
        personas=em.createQuery(jpql).getResultList();
        //mostrarConsulta(personas);
        
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);
        
        jpql = "select u from Usuario u left join fetch u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
        
        

        em.close();
    }

    private static void mostrarConsulta(List<Persona> personas) {
        for (Persona persona : personas) {
            log.debug("persona: " + persona);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario  u: usuarios) {
            log.debug("Usuarios: " + u);
        }    
    }

}
