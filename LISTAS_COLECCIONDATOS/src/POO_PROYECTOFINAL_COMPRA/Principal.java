package POO_PROYECTOFINAL_COMPRA;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuar=false;
        System.out.print("->INGRESE SU CREDITO: ");
        double credito=sc.nextDouble();
        TarjetaCredito tarjeta=new TarjetaCredito(credito);
      //  System.out.println(tarjeta.getCredito());
        sc.nextLine();
        ArrayList<Compra> listaProductos=new ArrayList<>();
        while(!continuar){
            System.out.print("Que producto comprara: ");
            String producto=sc.nextLine();

            System.out.print("Precio del producto: ");
            double precio=sc.nextDouble();
            sc.nextLine();
            Compra compra=new Compra(producto, precio);
            boolean compraRealizada=tarjeta.realizarCompra(compra);
            if(compraRealizada){
                System.out.println("Compra realizada con exito...!");
            }else{
                System.out.println("Saldo Insuficiente");
                continuar=false;
            }
            System.out.println("++++ DESEA CONTINUAR CON SU COMPRA (S/N)  +++++");
            char opcion=sc.next().charAt(0);
            sc.nextLine();
            if(opcion=='n' || opcion=='N'){
                continuar=true;
            }

        }
   
        System.out.println("Sesion concluida...!\n");
        System.out.println("+++++ LISTA DE COMPRAS +++++++");
        int item=1;
        Collections.sort(tarjeta.getListaCompras());
        for(Compra compra: tarjeta.getListaCompras()){
            System.out.println("- ITEM N°"+item + compra);
            item++;
        }
        System.out.println("====  PRECIO TOTAL: "+tarjeta.compraTotal()+" ====");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Tu saldo actualizado ===>"+tarjeta.getCredito());
        sc.close();


    }
}
