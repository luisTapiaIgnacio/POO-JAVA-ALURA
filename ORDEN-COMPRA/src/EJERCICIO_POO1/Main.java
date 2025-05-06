package EJERCICIO_POO1;

public class Main {
    public static void main(String[] args) {
        Pelicula peli1=new Pelicula("Harry poter", 1970);
        //1. imprimiendo directamente ->llama automaticamente a tostring
        System.out.println(peli1);
        //2. llamandolo explicitamente
        String texto=peli1.toString();
        System.out.println(texto);
        //3. en concatenacion de string
        System.out.println("info: "+peli1);

    }
}
