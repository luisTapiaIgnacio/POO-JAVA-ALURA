package POO_SUPERCLASE;

public class Alumno extends Persona{
    private int matricula;
    private String curso;
    public Alumno(String name, int age, int matricula, String curso){
        super(name, age);
        this.matricula=matricula;
        this.curso=curso;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }

    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }

    @Override

    public void mostrarInfo(){
        super.mostrarInfo();//llama al metodo mostrarinfo() de persona
        System.out.println("MATRICULA: "+matricula);
        System.out.println("CURSO: "+curso);
    }
}
