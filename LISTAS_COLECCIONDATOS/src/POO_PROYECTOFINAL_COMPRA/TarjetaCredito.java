package POO_PROYECTOFINAL_COMPRA;

import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {
    private double credito;
   // private double limite;
    private List<Compra>listaCompras;

    public TarjetaCredito(double credito) {
        this.credito = credito;

        this.listaCompras=new ArrayList<>();
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

/*    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

 */
    public boolean realizarCompra(Compra compra){
        if(this.credito>=compra.getPrecio()){
            credito=credito- compra.getPrecio();
            listaCompras.add(compra);
            return true;
        }
        return false;
    }

    public List<Compra> getListaCompras(){
        return listaCompras;
    }

    public double compraTotal(){
        double total=0;
        for(Compra compra:listaCompras){
            total=total+compra.getPrecio();
        }
        return total;
    }
}
