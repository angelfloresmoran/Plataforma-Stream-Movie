import java.util.Scanner;

public class Evaluaciones {
    public static void main (String[] args){
        Scanner lecturaTeclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe con que nota quieres calificar la pelicula Lone Survivor");
            nota = lecturaTeclado.nextDouble();
            if (nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones ++;
            }
        }
        System.out.println("La media de evaluaciones para Lone Survivor es de: " + mediaEvaluaciones / totalEvaluaciones);
        lecturaTeclado.close();
    }
}
