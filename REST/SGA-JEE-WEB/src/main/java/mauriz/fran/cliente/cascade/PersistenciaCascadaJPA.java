package mauriz.fran.cliente.cascade;

import javax.persistence.*;
import mauriz.fran.dominio.Persona;
import mauriz.fran.dominio.Usuario;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //paso 1 creamos un objeto
        Persona persona1 = new Persona("dani", "mauriz", "dani@mail.com", "123678345");

        // paso 2 creamos objeto usuario
        Usuario usuario1 = new Usuario("danim", "1234", persona1);

        //paso persistimos el objeto usuario, solo el usuario
        em.persist(usuario1);

        // paso 4 hacemos comit
        tx.commit();

        // log
        log.debug("Persona: " + persona1);
        log.debug("Usuario: " + usuario1);

        em.close();

    }
}
