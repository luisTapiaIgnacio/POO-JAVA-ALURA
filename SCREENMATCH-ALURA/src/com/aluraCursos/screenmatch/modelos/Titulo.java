package com.aluraCursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionenMinutos;
    private boolean incluidoPlan;
    private double sumaEvalueaciones;
    private int totalEvaluaciones;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getFechaLanzamiento(){
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(int fechaLanzamiento){
        this.fechaLanzamiento=fechaLanzamiento;
    }
    public int getDuracionenMinutos(){
        return duracionenMinutos;
    }
    public void setDuracionenMinutos(int duracionenMinutos){
        this.duracionenMinutos=duracionenMinutos;
    }
    public boolean getIncluidoPlan(){
        return incluidoPlan;
    }
    public void setIncluidoPlan(boolean incluidoPlan){
        this.incluidoPlan=incluidoPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void infoFichaTecnica(){
        System.out.println("NOMBRE DE PELICULA: "+nombre);
        System.out.println("FECHA DE LANZAMIENTO: "+fechaLanzamiento);
        System.out.println("DURACION EN MINUTOS: "+getDuracionenMinutos());
    }
    public void evalua(double nota){
        sumaEvalueaciones+=nota;
        totalEvaluaciones++;
    }
    public double calculaMedia(){
        return sumaEvalueaciones/totalEvaluaciones;
    }


}
