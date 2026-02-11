
public class Juego {
    private String titulo;
    private double precio;
    private String genero;

    public Juego(String titulo, double precio String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private static void altaJuego() {
        System.out.print("Título del juego: ");
        String titulo = scanner.nextLine();
        System.out.print("Precio del juego: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        Juego juego = new Juego(titulo, precio);
        juegos.add(juego);
        System.out.println("Juego añadido correctamente.");
    }

    private static void listarJuegos() {
        System.out.println("=== Lista de Juegos ===");
        for (Juego j : juegos) {
            System.out.println("Título: " + j.getTitulo() + " | Precio: " + j.getPrecio());
        }
    }
}