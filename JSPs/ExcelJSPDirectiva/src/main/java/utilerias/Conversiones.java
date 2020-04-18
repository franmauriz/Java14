package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    
    public static final String FORMATO_FECHA="dd-mm";
    
    public static String forma(Date fecha){
        SimpleDateFormat formato = new SimpleDateFormat(FORMATO_FECHA);
        return formato.format(fecha);
    }
    
    public static String forma(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat(FORMATO_FECHA);
        return formato.format(fecha);
    }
    
}
