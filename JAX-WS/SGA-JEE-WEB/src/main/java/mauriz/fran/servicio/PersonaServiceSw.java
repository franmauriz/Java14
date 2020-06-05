package mauriz.fran.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mauriz.fran.dominio.Persona;

@WebService
public interface PersonaServiceSw {
    @WebMethod
    public List<Persona> listarPersonas();  
}
