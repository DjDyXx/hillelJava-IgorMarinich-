import java.util.Scanner;

/**
 * Created by DyXx on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number , please : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("This number multiple of this numbers : ");
        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
        }
    }
}
