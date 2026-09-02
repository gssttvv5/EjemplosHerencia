public abstract class Animal {
    private String nombre;
    private boolean esHerbivoro;

    // Constructor para inicializar los atributos comunes
    public Animal(String nombre, boolean esHerbivoro) {
        this.nombre = nombre;
        this.esHerbivoro = esHerbivoro;
    }

    // Método abstracto: cada animal DEBE implementar su propio sonido
    public abstract void hacerSonido();

    // Método concreto: todos los animales comparten este comportamiento
    public void mostrarInfo() {
        System.out.print(nombre + " hace ");
        hacerSonido(); // Llama al método implementado por la clase hija

        if (esHerbivoro) {
            System.out.println("Dieta: Es herbívoro.\n");
        } else {
            System.out.println("Dieta: No es herbívoro (carnívoro/omnívoro).\n");
        }
    }
}