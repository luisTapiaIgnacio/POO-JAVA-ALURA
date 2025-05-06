package EJERCICIO_POO1;

public class Pelicula {
    private String titulo;
    private int año;
    public Pelicula(String titulo, int año){
        this.titulo=titulo;
        this.año=año;
    }

    //sobreescribiendo tostring
    @Override
    public String toString(){
        return "PELICULA: "+titulo + " ("+ año + ")";
    }
}
