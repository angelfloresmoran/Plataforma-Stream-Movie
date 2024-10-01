public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Math");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (notaDeLaPelicula + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una pelīcula muy buena
                La mejor de fin del milenio 
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int calsificacion = (int) (media / 2);
        System.out.println(calsificacion);

    }
}