import java.util.Random;
import java.util.Scanner;
public class SecretGame {
    public static void main(String[] args) {
        //Declaración de Variables para el juego
        int numeroSecreto = new Random().nextInt(100);
        int limiteDeIntentos = 5;
        int intentos = 1;
        int numeroUsuario;
        String palabraIntento = " intento.";

        //Instancia metodo lectura por teclado
        Scanner lecturaTeclado = new Scanner(System.in);

        System.out.println("*****Bienvenido sl juego del número secreto*****\n ");
        System.out.println(numeroSecreto);
        while (intentos <= limiteDeIntentos){
            System.out.println("Ingresa un número entero entre el 1 y el 100");
            numeroUsuario = lecturaTeclado.nextInt();
            if (numeroUsuario > 0 && numeroUsuario <= 100){
                if (numeroUsuario == numeroSecreto){
                    System.out.println("Felicidades haz adivinado el número Secreto: " + numeroSecreto);
                    System.out.println("Lo lograste en: " + intentos + palabraIntento);
                    break;
                } else if (numeroUsuario>numeroSecreto) {
                    System.out.println("El número secreto es menor.");
                } else if (numeroUsuario<numeroSecreto) {
                    System.out.println("El número secreto es mayor");
                }
                intentos++;
                palabraIntento =  " intentos.";
                if (intentos > limiteDeIntentos){
                    System.out.println("Haz agotado el número de intentos disponibles el número secreto es");
                    System.out.println("***** " + numeroSecreto + " *****");
                }
            }
            else {
                System.out.println("Ingresa datos validos!");
            }
        }
    }
}
