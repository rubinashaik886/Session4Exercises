import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random num = new Random();
        int randomNumber = num.nextInt(3);
        System.out.println(randomNumber);

        if (randomNumber == 0) {
            System.out.println("Rock");
        }
        if (randomNumber == 1) {
            System.out.println("Paper");
        }
        if (randomNumber == 2) {
            System.out.println("Scissors");
        }

    }
}
