public class Aguila extends Animal {
    public Aguila() {
        super("Aguila", false);
    }

    @Override
    public void hacerSonido() {
        System.out.println("\"¡Chillido!\"");
    }
}