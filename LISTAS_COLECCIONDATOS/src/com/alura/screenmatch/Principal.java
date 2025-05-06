package com.alura.screenmatch;

import com.alura.screenmatch.calculos.CalculadoraTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Episodio;

import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("DURACION DE LA PELI: "+miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());

        Serie lost = new Serie();
        lost.setNombre("Lost");
        lost.setFechaDeLanzamiento(2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Avatar");
        otraPelicula.setFechaDeLanzamiento(2023);
        otraPelicula.setDuracionEnMinutos(200);

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);

        var peliculaBruno=new Pelicula();
        peliculaBruno.setNombre("El señor de los anillos");
        peliculaBruno.setDuracionEnMinutos(180);
        peliculaBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaPelicula=new ArrayList<>();
        listaPelicula.add(peliculaBruno);
        listaPelicula.add(miPelicula);
        listaPelicula.add(otraPelicula);

        System.out.println("Tamaño de la lista: "+listaPelicula.size());
        System.out.println("La 1ra pelicula es: "+listaPelicula.get(0).getNombre());
        System.out.println(listaPelicula);





    }
}
