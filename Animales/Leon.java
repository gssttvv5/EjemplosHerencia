public class Leon extends Animal {
        public Leon() {
            super("León", false);
        }

        @Override
        public void hacerSonido() {
            System.out.println("\"¡Roar!\"");
        }
}