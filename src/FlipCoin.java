import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();

        if (chance < 0.50) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}

