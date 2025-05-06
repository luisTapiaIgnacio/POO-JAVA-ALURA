package POO_BIBLIOTECA;

public class Revista extends Biblioteca {
private int numEdicion;
public Revista(String titulo, String autor, int numEdicion){
    super(titulo, autor);
    this.numEdicion=numEdicion;
}

@Override
    public String toString(){
    return "======REVISTA======\n"+ super.toString() + "\nNUMERO DE EDICION: "+numEdicion;
}


}
