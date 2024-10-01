import java.util.Scanner;

public class AppBancoAngel {
    public static void main (String[] args){
        String nombreUsuario = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoUsuario = 20100.80;
        int numeroOperacion = 0;
        double montoRetirar;
        double montoDepositar;
        Scanner operacionArealizar = new Scanner(System.in);

        System.out.println("***********BIENVENIDO A BANCO ANGEL***************\n");
        System.out.println("Nombre del cliente: " + nombreUsuario);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldoUsuario  + " MX\n");
        System.out.println("**************************************************");

        while (numeroOperacion != 9){
            System.out.println("**Escriba la opción Deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            numeroOperacion = operacionArealizar.nextInt();

            switch (numeroOperacion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoUsuario + " MX");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea retirar: \n");
                    montoRetirar = operacionArealizar.nextDouble();
                    if (montoRetirar < saldoUsuario && montoRetirar > 0){
                        System.out.println("Su saldo Actualizado es de: " + (saldoUsuario -= montoRetirar));
                    } else if (montoRetirar > saldoUsuario) {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar");
                    montoDepositar = operacionArealizar.nextDouble();
                    System.out.println("Su saldo Actualizado es de: " + (saldoUsuario += montoDepositar));
                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Valor no valido, seleccione una opción del menu mostrado");
                    break;
            }
        }
    }
}
