package com.aluraCursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodioTemporada;
    int minutoEpisodio;

    public int getDuracionMinutos(){
        return temporadas*episodioTemporada*minutoEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioTemporada() {
        return episodioTemporada;
    }

    public void setEpisodioTemporada(int episodioTemporada) {
        this.episodioTemporada = episodioTemporada;
    }

    public int getMinutoEpisodio() {
        return minutoEpisodio;
    }

    public void setMinutoEpisodio(int minutoEpisodio) {
        this.minutoEpisodio = minutoEpisodio;
    }
}
