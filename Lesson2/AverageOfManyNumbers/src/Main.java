import java.util.Scanner;

/**
 * Created by DyXx on 02.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AverageOfAnyNumbers");
        Scanner operand = new Scanner(System.in);
        System.out.println("How many numbers will be?");
        int amount = operand.nextInt();
        int counter = 1;
        double sum = 0;
        while (counter<=amount){
            System.out.println("Enter a " + "№"+counter+" number");
            counter++;
            double buffNumber = operand.nextDouble();
            sum+=buffNumber;
        }
        double result = sum/amount;
        System.out.println("Your Average of " + amount + " numbers is " + result);
    }
}
