package EJERCICIO_POO4;

public class Main {
    public static void main(String[] args) {
        Estudiante ana=new Estudiante(100, "ANA");
        Estudiante matias=new Estudiante(101, "MATIAS");
        Estudiante maria= new Estudiante(102, "MARIA");

        Curso matematica=new Curso(1, "MATEMATICA");
        Curso fisica=new Curso(2, "FISICA");
        Curso filofofia = new Curso(3, "Filofosia");

        ana.inscribirse(matematica);
        ana.inscribirse(fisica);

        matias.inscribirse(fisica);
        matias.inscribirse(filofofia);

        maria.inscribirse(matematica);

        // mostrar los cursos de cada estudiante
        ana.mostrarCursos();
        matias.mostrarCursos();
        maria.mostrarCursos();
        System.out.println("**********************************");
        //mostrar los cursos de cada estudiante
        matematica.mostrarEstudiante();
        fisica.mostrarEstudiante();
        filofofia.mostrarEstudiante();
    }
}
