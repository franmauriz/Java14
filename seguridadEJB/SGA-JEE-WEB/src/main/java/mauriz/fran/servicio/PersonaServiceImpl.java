package mauriz.fran.servicio;


import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mauriz.fran.datos.PersonaDao;
import mauriz.fran.dominio.Persona;

@Stateless
@WebService(endpointInterface="mauriz.fran.servicio.PersonaServiceSw")
@DeclareRoles({"ROLE_ADMIN","ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN","ROLE_USER"})
public class PersonaServiceImpl implements PersonaServiceRemote,PersonaService, PersonaServiceSw{

    @Inject
    private PersonaDao personaDao; 
    
    @Override
    public List<Persona> listarPersonas() {
        
        return personaDao.findAllPersona();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }
    
    
    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
