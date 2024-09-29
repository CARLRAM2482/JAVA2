package com.aluracursos.screenmacth.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempos {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
      this.tiempoTotal +=titulo.getDuracionEnMinutos();
    }

}
