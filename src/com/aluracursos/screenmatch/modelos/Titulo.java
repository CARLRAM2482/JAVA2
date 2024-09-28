package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;

    private int fechaDeLanzamiento;
    private    int duracionEnMinutos;
    private   boolean incluidoEnElPlan;
    private double sumaDeLasEvaluacines;

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
    }
    public     void evalua(double nota){
        sumaDeLasEvaluacines +=nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluacines / totalDeLasEvaluaciones;
    }
    }
