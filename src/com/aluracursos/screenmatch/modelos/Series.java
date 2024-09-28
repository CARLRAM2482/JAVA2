package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {
    int temporada;
    int episodioPorTemporada;
    int minutosPorEpisodios;

    @Override
    public int getDuracionEnMinutos() {
        return temporada * episodioPorTemporada * minutosPorEpisodios;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
}
