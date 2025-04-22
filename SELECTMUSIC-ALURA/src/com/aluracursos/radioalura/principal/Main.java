package com.aluracursos.radioalura.principal;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Favoritos;
import com.aluracursos.radioalura.modelos.Podcast;
public class Main {
    public static void main(String[] args) {
        Cancion miCancion=new Cancion();
        miCancion.setTitulos("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast=new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulos("Cafe.Tech");
        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.repro();
        }
        // podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.repro();
        }

        System.out.println("Total reproducciones: " + miCancion.getTotalRepro());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalLike());

        Favoritos favoritos = new Favoritos();
        favoritos.adicionar(miPodcast);
        favoritos.adicionar(miCancion);
    }
}
