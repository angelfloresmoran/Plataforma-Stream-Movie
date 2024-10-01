import java.util.Scanner;

public class Loops {
    public static void main (String[] args){
        Scanner lecturaTeclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvalcuaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe con que nota quieres calificar la pelicula Lone Survivor");
            nota = lecturaTeclado.nextDouble();
            mediaEvalcuaciones = mediaEvalcuaciones + nota;
        }
        System.out.println("La media de evaluaciones para Lone Survivor es de: " + mediaEvalcuaciones / 3);
    }
}
