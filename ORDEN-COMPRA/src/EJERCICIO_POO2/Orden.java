package EJERCICIO_POO2;

public class Orden {

    private int id;
    private String descripcion;
    private Cliente cliente;
    public Orden(int id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }

    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
