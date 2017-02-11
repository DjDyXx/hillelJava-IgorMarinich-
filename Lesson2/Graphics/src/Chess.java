import java.util.Scanner;

/**
 * Created by DyXx on 11.02.2017.
 */
public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle : ");
        int width = sc.nextInt();
        System.out.println("Enter length : ");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < width; k++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
