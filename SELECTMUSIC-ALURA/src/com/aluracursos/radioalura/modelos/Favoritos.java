package com.aluracursos.radioalura.modelos;

public class Favoritos {

    public void adicionar(Audio audio){
        if(audio.getClasificacion()>=8){
            System.out.println(audio.getTitulos() + "Es uno de los favorityos del momento");

        }else{
            System.out.println(audio.getTitulos()+"Tambien es uno de los favoritos");
        }
    }
}
