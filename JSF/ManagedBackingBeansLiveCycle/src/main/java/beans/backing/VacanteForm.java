package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacanteForm {
    @Inject
    private Candidato candidato;
    Logger log = LogManager.getRootLogger();
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("juan")){
            log.info("Entrando en el caso de Exito");
            return "exito";
        }else{
            log.info("Entrando en el caso de Fallo");
            return "fallo";
        }
    }
}
