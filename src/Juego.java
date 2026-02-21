import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private String titulo;
    private double precio;
    private String genero;

    private static ArrayList<Juego> juegos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Juego(String titulo, double precio, String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public static void altaJuego() {
        System.out.print("Título del juego: ");
        String titulo = scanner.nextLine();
        System.out.print("Precio del juego: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Género del juego: ");
        String genero = scanner.nextLine();

        Juego juego = new Juego(titulo, precio, genero);
        juegos.add(juego);
        System.out.println("Juego añadido correctamente.");
    }

    public static void listarJuegos() {
        System.out.println("=== Lista de Juegos ===");
        for (Juego j : juegos) {
            System.out.println("Título: " + j.getTitulo() + " | Precio: " + j.getPrecio() + " | Género: " + j.getGenero());
        }
    }
}