package EJERCICIO_POO3;

import java.util.ArrayList;
import java.util.List;

//relacion de uno a muchos
//un profesor puede tener varios cursos, pero cada curso solo pertenece a un profesor
public class Profesor {
    private String nombre;
    private int age;
    private String contextura;
    private List<Curso> cursos;
    public Profesor(String nombre, int age, String contextura){
        this.nombre=nombre;
        this.age=age;
        this.contextura=contextura;
        this.cursos=new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public int getAge(){
        return age;
    }
    public String getContextura(){
        return contextura;
    }

    public void agregarCurso(Curso curso){
    curso.setProfesor(this);
    cursos.add(curso);
    }
    public void mostrarCursos(){
        System.out.println("CURSOS DE: "+nombre);
        for(Curso curso: cursos){
            System.out.println("- "+curso.getCurso());
        }
    }


}
