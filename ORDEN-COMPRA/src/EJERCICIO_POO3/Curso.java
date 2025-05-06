package EJERCICIO_POO3;

public class Curso {
    private int id;
    private String curso;
    private int duracion;
    private Profesor profesor;
    public Curso(int id, String curso, int duracion){
        this.id=id;
        this.curso=curso;
        this.duracion=duracion;
    }

    public String getCurso(){
        return curso;
    }
    public void setProfesor(Profesor profesor){
        this.profesor=profesor;
    }
    public Profesor getProfesor(){
        return profesor;
    }
}
