public class Vaca extends Animal {
    public Vaca() {
        super("Vaca", true);
    }

    @Override
    public void hacerSonido() {
        System.out.println("\"¡Muuu!\"");
    }
}