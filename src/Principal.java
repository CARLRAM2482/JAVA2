import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

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

        Series casaDragon = new Series();
        casaDragon.setNombre("casa del dragón");
        casaDragon.setFechaDeLanzamiento(2023);
        casaDragon.setTemporada(2);
        casaDragon.setMinutosPorEpisodios(52);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Vengadores");
        otraPelicula.setFechaDeLanzamiento(2000);
        otraPelicula.setDuracionEnMinutos(120);

        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("tiempo necesario para ver tus contenidos favoritos  "  +calculadora.getTiempoTotal());






   //     System.out.println("mi otra pelicula es : " + otraPelicula.nombre);
   //     System.out.println("fecha de lanzamiento es : " + otraPelicula.fechaDeLanzamiento);

        
    }
}
