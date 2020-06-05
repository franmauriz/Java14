package mauriz.fran.servicio;


import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mauriz.fran.datos.PersonaDao;
import mauriz.fran.dominio.Persona;

@Stateless
@WebService(endpointInterface="mauriz.fran.servicio.PersonaServiceSw")
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
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
