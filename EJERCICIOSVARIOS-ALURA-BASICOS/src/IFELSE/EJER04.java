package IFELSE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJER04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> listaNum=new ArrayList<>();

        System.out.println("Ingrese el 1er numero: ");
        listaNum.add(sc.nextInt());
        System.out.println("Ingrese el 2do numero: ");
        listaNum.add(sc.nextInt());
        System.out.println("Ingrese el 3cer numero: ");
        listaNum.add(sc.nextInt());

        int mayorNum=listaNum.get(0);//asumimo q el 1er numero es mayor

        for(int num:listaNum){
            if(num > mayorNum){
                mayorNum=num;
            }
        }

        System.out.println("EL NUMERO MAYOR ES: "+mayorNum);
        sc.close();
    }
}
