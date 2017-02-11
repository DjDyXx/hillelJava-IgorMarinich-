import java.util.Scanner;

/**
 * Created by DyXx on 09.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = sc.nextInt();
        int counter = 0;
        int result = 0;
        int buffCounter = number;
        while (buffCounter > 0) {
            buffCounter /= 10;
            counter++;
        }
        for (int i = 0; i < counter; i++) {
            result = result +  (number % 10);
            number/=10;
        }
        System.out.println("Result : " +result);
    }
}
