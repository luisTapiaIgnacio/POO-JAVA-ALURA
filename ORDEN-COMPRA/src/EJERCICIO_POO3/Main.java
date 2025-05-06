package EJERCICIO_POO3;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1=new Profesor("fabricio", 37, "delgado");

        Curso curso1=new Curso(100, "matematica", 20);
        Curso curso2=new Curso(101, "fisica", 23);

        profesor1.agregarCurso(curso1);
        profesor1.agregarCurso(curso2);

        profesor1.mostrarCursos();

        System.out.println("EL CURSO: "+ curso2.getCurso()+ " PERETENECE A: "+ curso2.getProfesor().getNombre());
    }
}
