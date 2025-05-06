package POO_SUPERCLASE;

public class Alumno1 extends Persona1{
    private int matricula;
    private String curso;
    public Alumno1(String name, int age, int matricula, String curso){
        super(name, age);
        this.matricula=matricula;
        this.curso=curso;
    }
    @Override
    public String toString(){
        return super.toString() + "\nMATRICULA: "+matricula + "\nCURSO: "+curso;
    }
}
