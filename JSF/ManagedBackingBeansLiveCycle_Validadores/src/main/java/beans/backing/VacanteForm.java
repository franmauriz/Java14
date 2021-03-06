package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    
    public VacanteForm(){
        log.info("Creando el objeto VacanteForm");
    }
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("juan")){
            if(this.candidato.getApellido().equals("perez")){
                String msg = "Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage;
                facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId=null;
                facesContext.addMessage(msg, facesMessage);
                return "index";                
            }
            log.info("Entrando en el caso de Exito");
            return "exito";
        }else{
            log.info("Entrando en el caso de Fallo");
            return "fallo";
        }
    }
}
