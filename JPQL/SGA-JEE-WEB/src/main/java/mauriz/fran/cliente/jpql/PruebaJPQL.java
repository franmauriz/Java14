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
            log.debug("nombre: " + nombre + " apellido: " + apellido + " email: " + email);            
        }
        

        em.close();
    }

    private static void mostrarConsulta(List<Persona> personas) {
        for (Persona persona : personas) {
            log.debug("persona: " + persona);
        }
    }

}
