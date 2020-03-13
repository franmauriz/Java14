
public class SobreCargaMetodos {

    public static void main(String[] args) {
        System.out.println("Suma de numeros enteros:" + Operaciones.sumar(3, 2));
        System.out.println("Suma de numeros dobles:" + Operaciones.sumar(3.3D, 2.3D));
        System.out.println("Suma de numeros flotantes:" + Operaciones.sumar(3F, 2F));
        System.out.println("Suma de numeros enteros + dobles:" + Operaciones.sumar(3, 2.4D));
    }
}
