package POO_REFERENCIA;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //getter
    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //setter para actualizar el precio
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
