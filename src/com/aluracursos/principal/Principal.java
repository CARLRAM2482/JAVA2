package com.aluracursos.principal;

import com.aluracursos.FiltroRecomendaciones;
import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempos;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Propio tipo de datos una nueva istancia
        Pelicula miPelicula = new Pelicula("logan", 2021);
        miPelicula.setNombre("logan");
        miPelicula.setFechaDeLanzamiento(2022);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7);
        miPelicula.evalua(9);
        miPelicula.evalua(9);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Series casaDragon = new Series("casa del dragon", 2023);
        casaDragon.setNombre("casa del dragón");
        casaDragon.setFechaDeLanzamiento(2023);
        casaDragon.setTemporada(2);
        casaDragon.setMinutosPorEpisodios(52);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("vengadores", 2000);
        otraPelicula.setNombre("Vengadores");
        otraPelicula.setFechaDeLanzamiento(2000);
        otraPelicula.setDuracionEnMinutos(120);

        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("tiempo necesario para ver tus contenidos favoritos  " + calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("casa targaryer");
        episodio.setSeries(casaDragon);
        episodio.setTotalVisualizaciones(350);

        filtroRecomendaciones.filtra(episodio);

        var peliculaDeBruno = new Pelicula("el señor de los anillos",2021);
        peliculaDeBruno.setNombre();
        peliculaDeBruno.setDuracionEnMinutos(160);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePelicula = new ArrayList<>();
        listaDePelicula.add(miPelicula);
        listaDePelicula.add(otraPelicula);
        listaDePelicula.add(peliculaDeBruno);

        System.out.println("tamaño de la lista  "+ listaDePelicula.size());
        System.out.println("la primera pelicula es:  " +listaDePelicula.get(0).getNombre());

        System.out.println(listaDePelicula);

        System.out.println( "toString de la pelicula" + listaDePelicula.get(0).toString());

        Object object = peliculaDeBruno;



    }
}
