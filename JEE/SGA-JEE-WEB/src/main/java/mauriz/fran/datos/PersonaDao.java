package mauriz.fran.datos;

import java.util.List;
import mauriz.fran.dominio.Persona;

public interface PersonaDao {
    
    public List<Persona> findAllPersona();
    public Persona findPersonaById(Persona persona);
    public Persona findPersonaByEmail(Persona persona);
    public void insertPersona(Persona persona);
    public void updatePersona(Persona persona);
    public void deletePersona(Persona persona);
}
