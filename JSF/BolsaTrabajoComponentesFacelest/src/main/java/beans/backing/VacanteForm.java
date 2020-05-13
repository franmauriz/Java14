package beans.backing;

import beans.helper.ProvinciaHelper;
import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
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
    private boolean comentarioEnviado;

    @Inject
    private ProvinciaHelper provinciaHelper;

    public VacanteForm() {
        log.info("Creando el objeto VacanteForm");
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("juan")) {
            if (this.candidato.getApellido().equals("perez")) {
                String msg = "Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage;
                facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(msg, facesMessage);
                return "index";
            }
            log.info("Entrando en el caso de Exito");
            return "exito";
        } else {
            log.info("Entrando en el caso de Fallo");
            return "fallo";
        }
    }

    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        int nuevoCodigoPostal = ((Long) valueChangeEvent.getNewValue()).intValue();

        UIInput provinciaIdInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:provinciaid");
        int provinciaId = this.provinciaHelper.getProvinciaIdPorCodigoPostal(nuevoCodigoPostal);
        provinciaIdInputText.setValue(provinciaId);
        provinciaIdInputText.setSubmittedValue(provinciaId);

        UIInput municipiodInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:municipio");
        String nuevoMunicipio = "Mairena del Aljarafe";
        municipiodInputText.setValue(nuevoMunicipio);
        municipiodInputText.setSubmittedValue(nuevoMunicipio);

        facesContext.renderResponse();

    }

    public void ocultarComentario(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public ProvinciaHelper getProvinciaHelper() {
        return provinciaHelper;
    }

    public void setProvinciaHelper(ProvinciaHelper provinciaHelper) {
        this.provinciaHelper = provinciaHelper;
    }

}
