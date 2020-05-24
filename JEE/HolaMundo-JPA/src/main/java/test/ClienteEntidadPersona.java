package test;

import javax.persistence.*;
import javax.persistence.Persistence;
import mauriz.fran.sga.dominio.Persona;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    static Logger log=LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // inicia la transacion
        tx.begin();
        // sin id
        Persona persona1= new Persona("roberto","mauriz","roberto@mail.com","954168729");
        log.debug("Objeto a persistir " + persona1);
        //Persisitimos el objeto
        em.persist(persona1);
        //terminamos la transacion
        tx.commit();
        log.debug("Objeto persistido " + persona1);
        em.close();
    }
}
