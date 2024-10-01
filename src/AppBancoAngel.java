import java.util.Scanner;

public class AppBancoAngel {
    public static void main (String[] args){
        String nombreUsuario = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoUsuario = 20100.80;
        int numeroOperacion = 0;
        double montoRetirar;
        double montoDepositar;
        String menu = """
                **Escriba la opción Deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner operacionARealizar = new Scanner(System.in);

        System.out.println("***********BIENVENIDO A BANCO ANGEL***************\n");
        System.out.println("Nombre del cliente: " + nombreUsuario);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldoUsuario  + " MX\n");
        System.out.println("**************************************************");

        while (numeroOperacion != 9){
            System.out.println(menu);
            numeroOperacion = operacionARealizar.nextInt();

            switch (numeroOperacion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoUsuario + " MX");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea retirar: \n");
                    montoRetirar = operacionARealizar.nextDouble();
                    if (montoRetirar < saldoUsuario && montoRetirar > 0){
                        System.out.println("Su saldo Actualizado es de: " + (saldoUsuario -= montoRetirar));
                    } else if (montoRetirar > saldoUsuario) {
                        System.out.println("Saldo insuficiente");
                    }else if (montoRetirar <=0){
                        System.out.println("Ingresa un valor mayor a 0");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar");
                    montoDepositar = operacionARealizar.nextDouble();
                    if (montoDepositar > 0){
                        System.out.println("Su saldo Actualizado es de: " + (saldoUsuario += montoDepositar));
                    }
                    else {
                        System.out.println("Valor no valido! Ingrese un monto mayor a 0");
                    }
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
