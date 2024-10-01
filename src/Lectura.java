import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Instancia la clase Scanner para utilizar la funcionalidad de lectura por teclado.

        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();//el metodo *nextLine* se utiliza para almacenar los tipos de datos String
        System.out.println("Escribe la fecha de lanzamiento de la pelicula:" + pelicula + "." );
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por último indicanos con que nota quieres calificar a: " + pelicula);
        double nota = teclado.nextDouble();

        System.out.println("Titulo de la pelicula: " + pelicula + ". Fue lanzada en: " + fechaDeLanzamiento + " y la nota que ha dejado el usuario es un: "+ nota);

    }
}
