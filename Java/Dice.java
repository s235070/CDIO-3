public class Dice {
    public static int rollDice() {
        var random = new java.util.Random();
        return random.nextInt(6) + 1;
    }
}
