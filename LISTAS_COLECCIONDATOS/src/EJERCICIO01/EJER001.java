package EJERCICIO01;

import java.util.Arrays;

//ingresar 3 notas a una lista y mostrar el promedio
public class EJER001 {

    public static void main(String[] args) {
        String [] listaPais= {"peru", "argentina", "brasil", "mexico"};
        String mensaje="";
        //imprimir cuantos objetos existe en la lista
        int longitudLista=listaPais.length;
        System.out.println("EL N° DE OBJETOS EN LA LISTA ES: "+longitudLista);

        //imprimir el 2do elemento de la lista
        String elementoSel=listaPais[1];
        System.out.println("EL 2DO ELEMENTO DE LA LISTA ES: "+elementoSel);

        //agregar un objeto a la lista
        String [] nuevaLista= Arrays.copyOf(listaPais, listaPais.length+1);
        nuevaLista[nuevaLista.length-1]="colombia";




        // si existe el pais de peru, mencionar
        String seleccion="peru";


        //imprimir todos los objetos
        for(String pais:nuevaLista){
            System.out.println("-ITEM: "+pais.toUpperCase() + "\n");
            if(pais.equals(seleccion)){
                 mensaje="si esta dentro de la lista";
            }
        }

        System.out.println(mensaje);
    }

}
