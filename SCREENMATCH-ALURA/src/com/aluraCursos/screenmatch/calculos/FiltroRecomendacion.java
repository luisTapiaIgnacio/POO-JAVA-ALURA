package com.aluraCursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificable clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("Muy bien evaluado en el momento");
        }else if(clasificacion.getClasificacion()>=2){
            System.out.println("popular en el momento");
        } else{
            System.out.println("Vealo despues, colocalo en su lista");
        }
    }
}
