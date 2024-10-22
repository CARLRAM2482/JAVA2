package com.aluracursos.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnConvercionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe el nombre de una pelicula:");
        var busqueda = lectura.nextLine();

        String direccion = "https://www.omdbapi.com/?t="+busqueda.replace(" ", "+")+"&apikey=7b7ebea2";



        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya comvertido"+miTitulo);


            FileWriter escritura = new FileWriter("peliculas.txt");
            escritura.write(miTitulo.toString());
            escritura.close();
        }catch (NumberFormatException e){
            System.out.println("ocurio un error: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error en la URI, verifique la direccion");
        }catch (ErrorEnConvercionDeDuracionException e){
            System.out.println(e.getMensaje());
        }
        System.out.println("finalizo la ejecucion del programa!");




    }
}
