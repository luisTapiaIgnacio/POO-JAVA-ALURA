package POO_SUPERCLASE;

import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {
        ArrayList<Alumno1> listaAlumnos=new ArrayList<>();
        //agregar varios objetos a la lista
        listaAlumnos.add(new Alumno1("Juan", 20, 1001, "fisica"));
        listaAlumnos.add(new Alumno1("Maria", 30, 1002, "Matematica"));
        listaAlumnos.add(new Alumno1("Julia", 25, 1003, "quimica"));
        listaAlumnos.add(new Alumno1("Ernesto", 10, 1004, "informatica"));

        //mostrar todos los objetos
        for(Alumno1 alumno:listaAlumnos){
            System.out.println(alumno); //esto llama al metodo tostring
            System.out.println("++++++++++++++++++++++++++++");
        }
    }
}
