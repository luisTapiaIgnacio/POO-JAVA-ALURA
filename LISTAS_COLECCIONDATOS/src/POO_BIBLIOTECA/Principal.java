package POO_BIBLIOTECA;

import java.util.ArrayList;

import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Libro libro1=new Libro("Harry poter", "Henry derik", 500);
        Libro libro2= new Libro("Blanca nieves ", "jenny derik", 300);
        Libro libro3= new Libro("Guerra de tronos ", "Euricles den", 800);
        Libro libro4= new Libro("Alisman ", "Jhona beltran", 1300);
        Revista revista1=new Revista("Modas americanas", "jedry tomas", 250);

        System.out.println("*******************************************");

        // se añaden todos los libros y revistas
        ArrayList<Biblioteca> listaLibros=new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(revista1);

        // mostrar en general
        System.out.println( " ++++++LISTAR TODO EL MATERIAL ++++++++++");
        for(Biblioteca material:listaLibros){
            System.out.println(material);
            System.out.println("+++++++++++++++++++++++++++++++");

        }
        System.out.println("============LISTA ORDENADA DE TODO EL MATERIAL ===========");
        Collections.sort(listaLibros);
        for(Biblioteca material1:listaLibros){

            System.out.println(material1);
            System.out.println("+++++++++++++++++++++++++++++++");

        }

    }
}
