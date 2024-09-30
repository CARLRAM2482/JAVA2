package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clacificacion;

public class Episodio implements Clacificacion {
    private int numero;
    private String nombre;
    private Series series;
    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Series getSeries() {
        return series;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClasificacion() {
       if ( totalVisualizaciones >120){
           return 5;
       } else {
           return 2;
       }
    }
}
