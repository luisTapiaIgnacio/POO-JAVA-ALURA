package CAJERO;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Cuenta {
private double saldo;
private ArrayList<Movimiento> movimientos;

public Cuenta(double saldoInicial){
    this.saldo=saldoInicial;
    this.movimientos=new ArrayList<>();
}
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            registrarMovimiento("Depósito", monto);
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            registrarMovimiento("Retiro", monto);
            return true;
        }
        return false;
    }

    private void registrarMovimiento(String tipo, double monto) {

        Movimiento movimiento = new Movimiento(tipo, monto);
        movimientos.add(movimiento);
    }

    public void mostrarMovimientos() {
        if (movimientos.isEmpty()) {

            System.out.println("No hay movimientos registrados");
        }else {
            for (Movimiento m: movimientos){
                System.out.println(m);
            }
        }
}
}
