package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConvercionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private    int duracionEnMinutos;
    private   boolean incluidoEnElPlan;
    private double sumaDeLasEvaluacines;
    private int totalDeEvaluaciones;
    private int duracionEnMinutoos;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf( miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A"))
            throw new ErrorEnConvercionDeDuracionException("no puede convertir la duracion."+  "porque contiene N/A");
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));

    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    private int totalDeLasEvaluaciones;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public     int getTotalDeLasEvaluaciones(){
        return  totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("mi pelicula es : " + nombre);
        System.out.println("fecha de lanzamiento es : " + fechaDeLanzamiento);
        System.out.println("duración en minutos"+ getDuracionEnMinutos());
    }
    public     void evalua(double nota){
        sumaDeLasEvaluacines +=nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluacines / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otrTitulo) {
        return this.getNombre().compareTo(otrTitulo.getNombre());
    }

    @Override
    public String toString() {
        return
                "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+",duracion="+duracionEnMinutos+")";
    }
}
