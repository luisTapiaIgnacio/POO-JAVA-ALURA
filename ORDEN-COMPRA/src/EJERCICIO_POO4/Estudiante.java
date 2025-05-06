package EJERCICIO_POO4;

import java.util.ArrayList;
import java.util.List;

//relacion de muchos a muchos, un curso puede ser llevado x muchos estudiantes
public class Estudiante {
    private int id;
    private String nombre;
    private List<Curso> cursos;
    public Estudiante(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
        this.cursos=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirse(Curso curso){
        curso.agregarStudiante(this);
        cursos.add(curso);
    }
     public void mostrarCursos(){
         System.out.println("CURSOS DE: "+nombre);
         for(Curso curso : cursos){
             System.out.println("- "+curso.getMateria());
         }
     }



     @Override
    public String toString(){
        return "Estudiante: "+nombre;
     }
}
