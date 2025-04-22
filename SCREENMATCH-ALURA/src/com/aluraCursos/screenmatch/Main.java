package com.aluraCursos.screenmatch;

import com.aluraCursos.screenmatch.calculos.CalculadoraTiempo;
import com.aluraCursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluraCursos.screenmatch.modelos.Episodio;
import com.aluraCursos.screenmatch.modelos.Pelicula;
import com.aluraCursos.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula();

        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionenMinutos(120);
        miPelicula.setIncluidoPlan(true);

        miPelicula.infoFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("Media de evaluaciones de la pelicula: "+miPelicula.calculaMedia());

        System.out.println("************************************");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutoEpisodio(50);
        casaDragon.setEpisodioTemporada(10);
        casaDragon.infoFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        System.out.println("************************************");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracionenMinutos(180);

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtrar(episodio);
    }
}
