package POO_SUPERCLASE;

public class Persona {
    private String name;
    private int age;
    public Persona(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String nombre){
        this.name=nombre;
    }
    public  void  setAge(int edad){
        this.age=edad;
    }
    public void mostrarInfo(){
        System.out.println("NOMBRE: "+name);
        System.out.println("AGE: "+age);
    }

}
