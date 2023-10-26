package actividad05.ejercicio02;

public class Loteria implements Vendible{
    String numero;
    double precio;
    
    public Loteria(String numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Loteria [numero=" + numero + ", precio=" + precio + "]";
    }

}
