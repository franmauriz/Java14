package test;

import enumeraciones.Dias;
import enumeraciones.Continentes;

public class EjemploNumeraciones {

    public static void main(String[] args) {
        System.out.println(Dias.LUNES);
        System.out.print(Continentes.AMERICA + ":");
        System.out.println(Continentes.AMERICA.getPaises());

        for (Continentes continente : Continentes.values()) {
            System.out.println(continente + ":" + continente.getPaises());
        }
        
        indicarDia(Dias.JUEVES);

    }
    
    public static void indicarDia(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;
        }
    }
}
