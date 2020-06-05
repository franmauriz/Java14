package testclientews;

import clientews.servicio.*;

public class TestServicioSumaWS {
    public static void main(String[] args) {
        ServiciosumarWs servicioSumar = new ServiciosumaImplService().getServiciosumaImplPort();
        System.out.println("Ejecutando servicio suma ws");
        int x= 2;
        int y = 4;
        int resultado=servicioSumar.sumar(x, y);
        System.out.println("resultado = " + resultado);
        System.out.println("Fin del servicio suma ws");
        
    }
}
