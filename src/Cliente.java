public class Cliente {
    private String nombre;
    private int id;
    private double saldo;

    public Cliente(String nombre, int id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private static void altaCliente() {
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del cliente: ");
        int id = scanner.nextInt();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        Cliente cliente = new Cliente(nombre, id, saldo);
        clientes.add(cliente);
        System.out.println("Cliente añadido correctamente.");
    }

    private static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getId() + " | Nombre: " + c.getNombre() + " | Saldo: " + c.getSaldo());
        }
    }
}