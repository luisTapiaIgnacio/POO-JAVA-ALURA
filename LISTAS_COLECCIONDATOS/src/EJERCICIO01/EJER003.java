package EJERCICIO01;

import java.util.ArrayList;
import java.util.Scanner;

//INGRESAR 3 NOTAS Y CALCULAR EL PROMEDIO, GUARDAR EN UN ARRAYLIST
public class EJER003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma=0;
        int promedio;
        System.out.println("INGRESE 3 NOTAS: ");
        ArrayList<Integer> listaNotas=new ArrayList<>();

        for(int i=0; i<3; i++){
            System.out.println("INGRESE LA NOTA N°0"+(i+1)+" : ");
            int nota1=sc.nextInt();

            listaNotas.add(nota1);

        }
        System.out.println("NOTAS INGRESADAS: ");
        for(int nota:listaNotas){
            System.out.println("- "+nota);
            suma+=nota;
        }
        promedio=suma/3;
        System.out.println("LA SUMA DE SUS NOTAS ES: "+suma);
        System.out.println("EL PROMEDIO DE SUS NOTAS ES: "+promedio);
        sc.close();
    }
}
