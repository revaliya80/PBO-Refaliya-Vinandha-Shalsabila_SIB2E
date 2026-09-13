public class DragonMain {

    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("=== DRAGON 1 ===");

        dragon1.printStatus();

        dragon1.move(5); // atas
        dragon1.changeDirection(2); // kanan
        dragon1.move(3); // kanan

        dragon1.printStatus();

        System.out.println("\n=== DRAGON 2 ===");

        dragon2.changeDirection(5);
        dragon2.printStatus();

        dragon2.move(4);
        dragon2.changeDirection(0);
        dragon2.printStatus();
    }
}