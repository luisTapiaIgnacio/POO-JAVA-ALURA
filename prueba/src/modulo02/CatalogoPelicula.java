package modulo02;

public class CatalogoPelicula {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a la sala de peliculas...!");
        System.out.println("Pelicula: Patrix");
        int fechLanzamiento=1900;
        boolean planSus=true;
        double precioEntrada=4.20;

        double media=(8.2 + 5 + 9.5)/3;

        String sinopsis= """
                Matrix es una paradoja
                es una buena pelicula
                bien recomendada...!
                que fue lanzada en:
                """ + fechLanzamiento;

        System.out.println(sinopsis);

        int clasificacion=(int) media/2;

        System.out.println(clasificacion);
    }
}
