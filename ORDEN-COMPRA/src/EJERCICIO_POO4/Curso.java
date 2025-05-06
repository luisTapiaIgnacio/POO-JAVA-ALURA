package EJERCICIO_POO4;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String materia;
    private List<Estudiante> estudiantes;
    public Curso(int id, String materia){
        this.id=id;
        this.materia=materia;
        this.estudiantes=new ArrayList<>();
    }
    public void agregarStudiante(Estudiante estudiante){
        if(!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }
    }

    public void mostrarEstudiante(){
        System.out.println("ESTUDIANTES EN EL CURSO DE: " + materia);
        for(Estudiante estudiante: estudiantes){
            System.out.println("- "+ estudiante.getNombre());
        }
    }

    public String getMateria(){
        return materia;
    }

    @Override
    public String toString(){
        return  "MATERIA: "+materia;
    }
}
