package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulos;
    private int totalRepro;
    private int totalLike;
    private int clasificacion;

    public void meGusta(){
        this.totalLike++;
    }

    public void repro(){
        this.totalRepro++;
    }
    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getTotalRepro() {
        return totalRepro;
    }

    public void setTotalRepro(int totalRepro) {
        this.totalRepro = totalRepro;
    }

    public int getTotalLike() {
        return totalLike;
    }

    public void setTotalLike(int totalLike) {
        this.totalLike = totalLike;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
