package test;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj.intValue());
        
        int enteroPrimitivo = enteroObj;
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);
        
        Float flotanteObj = 13.4F;
        System.out.println("flotanteObj = " + flotanteObj);
        
        float flotantePrimitivo=flotanteObj;
        System.out.println("flotantePrimitivo = " + flotantePrimitivo);
        System.out.println("Entero a partir de flotante= " + flotanteObj.intValue());
    }
}
