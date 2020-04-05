package mauriz.fran.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import mauriz.fran.excepcion.Division;
import mauriz.fran.excepcion.MyExcepcion;

public class ExcepcionTest {
    public static void main(String[] args){
        Division div;
        try {
            div = new Division(2,0);
        } catch (MyExcepcion ex) {
            Logger.getLogger(ExcepcionTest.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
