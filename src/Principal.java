public class Principal {
    public static void main(String[] args) {
        //Propio tipo de datos una nueva istancia
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre ="logan";
        miPelicula.fechaDeLanzamiento = 2022;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("mi pelicula es : " +miPelicula.nombre);
        System.out.println("fecha de lanzamiento es : "+ miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Vengadores";
        otraPelicula.fechaDeLanzamiento = 2000;
        otraPelicula.duracionEnMinutos = 120;

        System.out.println("mi otra pelicula es : " + otraPelicula.nombre);
        System.out.println("fecha de lanzamiento es : " + otraPelicula.fechaDeLanzamiento);

    }
}
