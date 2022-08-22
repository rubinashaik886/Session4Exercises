
import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args)
    {
        double weight = 132.5;
        double height = 62.5;

        double bmi = (weight/(Math.pow(height, 2.0)))*703;
        double bodyMassIndex = Math.ceil(bmi);

        System.out.println(bodyMassIndex);
    }
}
