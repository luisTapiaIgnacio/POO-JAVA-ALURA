package POO_COMPRATARJETA;

import java.util.ArrayList;
import java.util.Scanner;
//1. preguntar si deseo agregar mas productos s/n
//2. al principioo preguntar cuantos elementos ingresare a mi lista
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuar=false;

        Producto p2=new Producto("lejia", 2.30);

        ArrayList<Producto> listaProducto=new ArrayList<>();


        while (!continuar){
            System.out.println("Ingrese el Nombre del producto: ");
            String nombre=sc.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            Double precio=sc.nextDouble();

            Producto p1=new Producto(nombre, precio);
            listaProducto.add(p1);
            System.out.println("DESEA AGREGAR MAS ELEMENTO A LA LISTA: S/N");
            char opcion=sc.next().charAt(0);
            if(opcion=='n'|| opcion=='N'){
                continuar=true;
                System.out.println("Terminando sesion...!");
            }
            sc.nextLine();

        }
        for(Producto producto:listaProducto){
            System.out.println(producto);
            System.out.println("+++++++++++++++");
        }


       // System.out.println(listaProducto);

    }
}
