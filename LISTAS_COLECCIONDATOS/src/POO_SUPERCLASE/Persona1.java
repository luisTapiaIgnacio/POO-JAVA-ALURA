package POO_SUPERCLASE;

public class Persona1 {
    private String name;
    private int age;
    public Persona1(String name, int age){
       this.name=name;
       this.age=age;
    }
    public String toString(){
        return "NOMBRE: "+name+ "\nAGE: "+age;
    }
}
