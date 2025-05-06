package EJERCICIO01;

import java.util.ArrayList;

public class EJER002 {
    public static void main(String[] args) {
        ArrayList<String> listaPais=new ArrayList<>();
        listaPais.add("peru");
        listaPais.add("bolivia");
        listaPais.add("brasil");

        System.out.println("NUMERO DE PAISES EN LA LISTA: "+listaPais.size());
        //mostrar toda la lista
        for(String pais:listaPais){
            System.out.println("- " +pais);
        }
        System.out.println("***********************");
        //corregir brasil a brasilia
        listaPais.set(2, "brasilia");
        for(String pais:listaPais){
            System.out.println("- " +pais);
        }

        // verificar si un objeto existe o no
        boolean existe=listaPais.contains("brasilia");
        if(existe){
            System.out.println("existe el pais");
        }else{
            System.out.println("no existe el pais...!");
        }

        //eliminar un elemento
        System.out.println(listaPais.remove("peru"));
        for(String pais:listaPais){
            System.out.println("- " +pais);
        }
    }
}
