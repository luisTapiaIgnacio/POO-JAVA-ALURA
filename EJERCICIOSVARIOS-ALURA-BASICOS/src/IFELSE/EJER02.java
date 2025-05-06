package IFELSE;

import java.util.Scanner;

//INDIQUE EL NUMERO MAYOR DE 4 NUMEROS
public class EJER02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        int num1=sc.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        int num2=sc.nextInt();
        System.out.println("Ingrese el 3cer numero: ");
        int num3=sc.nextInt();

        int numMayor=num1;//asumimos el el num1 es el mayor
        if(num2 > numMayor){
            numMayor=num2;
        } else if (num3>numMayor) {
            numMayor=num3;
        }
        System.out.println("el numero mayor es: "+numMayor);
        sc.close();
    }
}
