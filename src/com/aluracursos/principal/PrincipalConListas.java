package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("logan", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("vengadores", 2000);
        miPelicula.evalua(7);
        var peliculaDeBruno = new Pelicula("el señor de los anillos",2021);
        peliculaDeBruno.evalua(9);
        Series casaDragon = new Series("casa del dragon", 2023);

        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() >3){
                System.out.println(pelicula.getClasificacion());
            }

        }
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("penelopes cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("lista de artista  ordenada:  "+ listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de titulos ordenados  "+ lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha:  "+lista);
    }
}
