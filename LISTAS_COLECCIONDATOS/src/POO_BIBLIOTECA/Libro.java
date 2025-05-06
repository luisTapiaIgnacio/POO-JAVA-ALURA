package POO_BIBLIOTECA;

public class Libro extends Biblioteca {
    private int numPaginas;
    public Libro(String titulo, String autor, int numPaginas){
        super(titulo, autor);
        this.numPaginas=numPaginas;
    }
    @Override
    public String toString(){
        return "======= LIBROS =======\n"+ super.toString() + "\nNUMERO DE PAGINAS: "+numPaginas;
    }
}
