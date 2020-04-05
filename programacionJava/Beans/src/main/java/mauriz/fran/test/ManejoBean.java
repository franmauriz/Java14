package mauriz.fran.test;

import mauriz.fran.beans.PersonaBean;

public class ManejoBean {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("fran");
        bean.setEdad(20);
        
        System.out.println(bean);
    }
}
