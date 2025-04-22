package com.aluraCursos.screenmatch.calculos;
import com.aluraCursos.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    private int tiempoTotal;

    public int getTiempoTotal(){
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionenMinutos();
    }
}
