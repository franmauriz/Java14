package mauriz.fran.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mauriz.fran.dominio.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas= new ArrayList<>();
        personas.add(new Persona(1,"fran","mauriz","fran@mail.com","654123678"));
        personas.add(new Persona(2,"esther","jaime","esther@mail.com","345987123"));
       
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
