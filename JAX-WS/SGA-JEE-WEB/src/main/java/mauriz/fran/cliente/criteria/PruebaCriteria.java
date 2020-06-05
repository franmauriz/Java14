package mauriz.fran.cliente.criteria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import mauriz.fran.dominio.Persona;
import org.apache.logging.log4j.*;

public class PruebaCriteria {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query=null;
        Persona persona = null;
        List<Persona> personas = null;
        
        // 1 listado de todas las personas
        log.debug("1º) CONSULTA PARA OBTENER LISTADO DE TODAS LAS PERSONAS");
        
        /// paso 1 , el objeto EntityManager crea una instancia de CriteriaBuilder
        
        cb = em.getCriteriaBuilder();
        
        /// paso 2 , Se crea un objeto de CriteriaQuery
        
        criteriaQuery = cb.createQuery(Persona.class);
        
        /// paso 3 , creamos el objeto raiz del query
        
        fromPersona = criteriaQuery.from(Persona.class);
        
        /// paso 4 , seleccionamos lo necesario del from
        
        criteriaQuery.select(fromPersona);
        
        /// paso 5 , creamos el query typeSafe
        
        query = em.createQuery(criteriaQuery);
        
        /// paso 6 , ejecutamos la consulta
        
        personas = query.getResultList();
        
        /// mostarmos datos
        
        mostrarPersonas(personas);
        
        // 2 CONSULTA PARA OBTENER LA PERSONA CON EL ID = 1
        log.debug("2º) CONSULTA PARA OBTENER LA PERSONA CON EL ID = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug(persona);
        
        log.debug("2º) CONSULTA PARA OBTENER LA PERSONA CON EL ID = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        
        List<Predicate> criterios = new ArrayList<Predicate>();
        // verificamos si tenemos criterios que agregar
        Integer idPersonaParam=2;
        
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class,"idPersona");
        
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        
        // se agregan los criterios
        if(criterios.isEmpty()){
            throw new RuntimeException("Sin criterios");
        }else if(criterios.size() == 1){
            criteriaQuery.where(criterios.get(0));
        }else{
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        persona = query.getSingleResult();
        log.debug(persona);
        
        
        
        
        
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p : personas){
            log.debug(p);
        }
    }
}
