package mauriz.fran.mundopc;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    private double precio;

    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamano, double precio) {
        this();
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
}
