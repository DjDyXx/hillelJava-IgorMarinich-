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
        int buff = amount;
        double sum = 0;
        while (buff>0){
            System.out.println("Enter a " + "№"+buff +" number");
            buff--;
            double buff1 = operand.nextDouble();
            sum+=buff1;
        }
        double result = sum/amount;
        System.out.println("Your Average of " + amount + " numbers is " + result);
    }
}
