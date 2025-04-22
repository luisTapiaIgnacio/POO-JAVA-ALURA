package CAJERO;
import java.util.Scanner;
public class CajeroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un cliente ficticio con saldo inicial
        Cliente cliente = new Cliente("Luis Tapia", "12345678", 1000);

        int opcion;
        do {
            System.out.println("\n===== Cajero Automático =====");
            System.out.println("Bienvenido, " + cliente.getNombre());
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver historial de movimientos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cliente.getCuenta().getSaldo()  );
                    break;
                case 2:
                    System.out.print("Ingresa monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cliente.getCuenta().depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingresa monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (cliente.getCuenta().retirar(retiro)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    cliente.getCuenta().mostrarMovimientos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
