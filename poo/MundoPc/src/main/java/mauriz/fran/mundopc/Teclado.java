package mauriz.fran.mundopc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclados;
    private double precio;

    public Teclado(String tipoEntrada, String marca, double precio) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

}
