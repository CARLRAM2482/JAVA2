import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        //Propio tipo de datos una nueva istancia
        Pelicula miPelicula = new Pelicula();
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






   //     com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
   //     otraPelicula.nombre = "Vengadores";
   //     otraPelicula.fechaDeLanzamiento = 2000;
  //      otraPelicula.duracionEnMinutos = 120;

   //     otraPelicula.muestraFichaTecnica();

   //     System.out.println("mi otra pelicula es : " + otraPelicula.nombre);
   //     System.out.println("fecha de lanzamiento es : " + otraPelicula.fechaDeLanzamiento);

    }
}
