package POO_REFERENCIA;

public class Prueba {
    public static void main(String[] args) {
        Producto p1=new Producto("Toma todo", 25.50);
        Producto p2=p1;
        p2.setPrecio(50.20);
        System.out.println("nombre producto: "+ p1.getNombre());
        System.out.println("precio producto: "+ p1.getPrecio());
        // actualizando el precio
        System.out.println("+++++++++++++++++++++++++++++");
        p2.setPrecio(55.20);

        System.out.println("nombre producto: "+ p2.getNombre());
        System.out.println("precio producto: "+ p2.getPrecio());

    }
}
