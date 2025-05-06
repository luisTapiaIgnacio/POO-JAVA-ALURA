package POO_BIBLIOTECA;

public class Biblioteca implements Comparable<Biblioteca>{
    private String titulo;
    private String autor;

    public Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "TITULO: "+titulo+ "\nAUTOR: "+autor;
    }

    @Override
    public int compareTo(Biblioteca otroTitulo) {
        return this.getTitulo().compareTo(otroTitulo.getTitulo());
       // return this.titulo.compareToIgnoreCase(otro.titulo); // ✅ Ignora mayúsculas/minúsculas
    }
}
