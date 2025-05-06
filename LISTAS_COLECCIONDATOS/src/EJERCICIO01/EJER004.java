package EJERCICIO01;

import java.util.ArrayList;
import java.util.Scanner;

public class EJER004 {
    public static void main(String[] args) {
        //ingresar 5 nombres luego mostrar los q tienen mas de 5 letras
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE 5 NOMBRES: ");
        ArrayList<String> listaNombres=new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Ingrese el nombre N°0"+ (i+1)+": ");
            String nombre=sc.nextLine();
            listaNombres.add(nombre);
        }
        //mostrar la lista de nombre
        for(String nombre:listaNombres){
            System.out.println("- "+nombre);
        }
        System.out.println("************************************");
        System.out.println("NOMBRES CON MAYOR DE 5 LETRAS");
        //mostrar los nombres que tienen mas de 5 letras
        for(String nombre:listaNombres){
            if(nombre.length()>5){
                System.out.println(nombre);
            }
        }

        sc.close();
    }
}
