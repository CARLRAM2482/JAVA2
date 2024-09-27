public class Pelicula {

    String nombre;

    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluacines;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return  totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica() {
        System.out.println("mi pelicula es : " + nombre);
        System.out.println("fecha de lanzamiento es : " + fechaDeLanzamiento);
    }
    void evalua(double nota){
        sumaDeLasEvaluacines +=nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return  sumaDeLasEvaluacines /totalDeLasEvaluaciones;

    }
}