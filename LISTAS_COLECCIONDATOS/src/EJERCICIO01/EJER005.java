package EJERCICIO01;

import java.util.ArrayList;
import java.util.Scanner;

public class EJER005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ingresar 5 elementos a la lista1
        ArrayList<String> lista1=new ArrayList<>();
        System.out.println("INGRESAR 5 ELEMENTOS A LA LISTA 1:");
        for(int i=0; i<5; i++){
            System.out.println( "Ingrese el elemento N°0"+(i+1)+": ");
            String nombre1=sc.nextLine();
            lista1.add(nombre1);
        }

        //ingresar 5 elementos a la lista2

        ArrayList<String> lista2=new ArrayList<>();
        System.out.println("INGRESAR 5 ELEMENTOS A LA LISTA 2: ");
        for(int j=0; j<5; j++){
            System.out.println( "Ingrese el elemento N°0"+(j+1)+": ");
            String nombre2=sc.nextLine();
            lista2.add(nombre2);
        }
        System.out.println("***************************");
        System.out.println(" CONTENIDO DE LALISTA 01: ");
        //mostrar la lista1 y lista2
        for(String nom1:lista1){
            System.out.println("- "+nom1);
        }

        System.out.println("***************************");
        System.out.println(" CONTENIDO DE LALISTA 02: ");
        //mostrar la lista1 y lista2
        for(String nom2:lista2){
            System.out.println("- "+nom2);
        }

        //paises repetidos
        ArrayList<String> listaRepetidos=new ArrayList<>();
        for(String item: lista1){
            if(lista2.contains(item)){
                listaRepetidos.add(item);
            }
        }

        System.out.println("paises repetidos en la lista: "+listaRepetidos);

        //combinar sin repetir
        ArrayList<String> unionListas=new ArrayList<>();
        unionListas.addAll(lista1);
        for(String nombre:lista2){
            if(!unionListas.contains(nombre)){
                unionListas.add(nombre);
            }
        }

        System.out.println("Todos los nombres (sin repetir) "+unionListas);


        sc.close();
    }
}
