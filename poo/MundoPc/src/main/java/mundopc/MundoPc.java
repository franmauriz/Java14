package mundopc;

import mauriz.fran.mundopc.*;

public class MundoPc {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("LG", 17.00, 200);
        Raton raton1 = new Raton("USB", "lOGITECH", 20.50);
        Teclado teclado1 = new Teclado("USB", "SONIC", 30.4);
        
        Computadora computadora1 = new Computadora("Lenovo", monitor1, teclado1, raton1);
              
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
        
    }
}
