package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("logan", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("vengadores", 2000);
        miPelicula.evalua(7);
        var peliculaDeBruno = new Pelicula("el señor de los anillos",2021);
        peliculaDeBruno.evalua(9);
        Series casaDragon = new Series("casa del dragon", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item : lista) {
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }
    }
}
