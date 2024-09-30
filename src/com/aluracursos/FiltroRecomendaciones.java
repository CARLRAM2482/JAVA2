package com.aluracursos;

import com.aluracursos.screenmacth.calculos.Clacificacion;

public class FiltroRecomendaciones {

   public void filtra(Clacificacion clacificacion){
        if (clacificacion.getClasificacion() >= 4){
            System.out.println("alta valoración");
        } else if (clacificacion.getClasificacion() >= 2){
            System.out.println("baja valoración");
        } else {
            System.out.println("agrega a tu lista para ver después");
        }
    }
}
