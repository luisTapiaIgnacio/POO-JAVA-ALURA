package POO_SUPERCLASE;

public class Principal {
    public static void main(String[] args) {
        Persona persona1=new Persona("julia", 24);
        Alumno alumno1= new Alumno("Juan", 22, 101, "Fisica");

        persona1.mostrarInfo();
        System.out.println(" ++++++INFORMACION INCIAL+++++++");
        alumno1.mostrarInfo();
        System.out.println("OBTENCION DE NOMBRE: " + alumno1.getName());

        //MODIFICAR INFORMAICON UTILIZANDO SETTERS
        alumno1.setName("Juanito");
        alumno1.setAge(22);
        alumno1.setMatricula(101);
        alumno1.setCurso("fisica y quimica");


        //MOSTRANDO INFORMACION ACTUALIZADA
        System.out.println(" ++++++INFORMACION ACTUALIZADA: +++++++");
        alumno1.mostrarInfo();
    }
}
