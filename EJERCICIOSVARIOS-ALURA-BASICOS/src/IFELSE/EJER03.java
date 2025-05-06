package IFELSE;

public class EJER03 {
    public static void main(String[] args) {
       int [] listaNum={1,2,3,4,5,6,7,8,9};
       int cantidad=listaNum.length;
        System.out.println("cantidad de numeros: "+cantidad);
        System.out.println(listaNum[2]);

        //obtendremos el numero maximo
        int numMaximo=listaNum[0]; //asumimos el el 1er numero es el maximo
        int numMinimo=listaNum[0]; //asumimos el 1er numero como minimo numero
        for(int num:listaNum){
            if(num>numMaximo){
                numMaximo=num;
            } if(num<numMinimo){
                numMinimo=num;
            }
        }

        System.out.println("el numero maximo es: "+numMaximo);
        System.out.println("el numero minimo es: "+numMinimo);


    }
}
