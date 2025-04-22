package CAJERO;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Movimiento {
    private String tipo;       // "Depósito" o "Retiro"
    private double monto;
    private String fecha;

    public Movimiento(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return fecha + " - " + tipo + ": $" + monto;
    }
}
