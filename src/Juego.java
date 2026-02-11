
public class Juego {
    private String titulo;
    private double precio;

    public Juego(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
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

    private enum genero("FPS,TPS, Battle Royale, RPG / MMORPG, Acción-Aventura, MOBARTS (Estrategia en tiempo real), Estrategia por turnos, Survival Horror, Sandbox / Mundo Abierto, Plataformas, Simulación (Vida, Vuelo, Carreras), Deportes, Metroidvania, Roguelike / Roguelite, Fighting (Lucha),PuzzlesParty, GamesNovela Visual");
}