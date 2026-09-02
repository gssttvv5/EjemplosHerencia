public class Elefante extends Animal {
    public Elefante() {
        super("Elefante", true);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Fffrrrr!");
    }
}