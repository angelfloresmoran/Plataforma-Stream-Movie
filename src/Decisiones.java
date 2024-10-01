public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento > 2022){
            System.out.println("Películas más Populares");
        }else {
            System.out.println("Peliculas Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoDePlan.equals("plus")){
            System.out.println("Disfrute de su pelicula!!!");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
