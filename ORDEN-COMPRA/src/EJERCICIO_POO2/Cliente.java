package EJERCICIO_POO2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private List<Orden> ordenes;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ordenes = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarOrden(Orden orden){
        //establecer una relacion inversa
        orden.setCliente(this);
        ordenes.add(orden);
    }

    public void mostrarOrdenes(){
        System.out.println("ORDENES DE: "+nombre+" : ");
        for(Orden orden: ordenes){
            System.out.println("- "+orden.getDescripcion());
        }
    }
}
