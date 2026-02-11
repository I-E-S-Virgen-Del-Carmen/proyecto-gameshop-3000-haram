import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n=== MENU GAME SHOP ===");
            System.out.println("1. Alta Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Alta Juego");
            System.out.println("4. Listar Juegos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Validación básica de entrada
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor ingresa un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    Cliente.altaCliente();
                    break;
                case 2:
                    Cliente.listarClientes();
                    break;
                case 3:
                    Juego.altaJuego();
                    break;
                case 4:
                    Juego.listarJuegos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
