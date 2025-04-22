package CAJERO;

public class Cliente {
    private String nombre;
    private String dni;
    private Cuenta cuenta;
    public Cliente(String nombre, String dni, double saldoInicial){
        this.nombre=nombre;
        this.dni=dni;
        this.cuenta=new Cuenta(saldoInicial);
    }

    public String getNombre() { return nombre;}



    public String getDni() {
        return dni;
    }



    public Cuenta getCuenta() {
        return cuenta;
    }


}
