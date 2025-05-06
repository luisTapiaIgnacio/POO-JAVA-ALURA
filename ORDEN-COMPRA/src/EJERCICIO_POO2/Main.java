package EJERCICIO_POO2;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1=new Cliente(1, "Luis Tap");
        Orden ordenc1=new Orden(101, "laptop lenovo");
        Orden ordenc2=new Orden(102, "mause gamer");

        cliente1.agregarOrden(ordenc1);
        cliente1.agregarOrden(ordenc2);

        cliente1.mostrarOrdenes();
        System.out.println("orden 2 peretenece a: "+ordenc2.getCliente().getNombre());


    }
}
