import java.util.Scanner;

/**
 * Created by DyXx on 11.02.2017.
 */
public class Envelope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int length = sc.nextInt();
        int width = length;
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < width; k++) {
                if (i == 0 ||i == length - 1  ||k == 0  || k == width - 1 || k == i || k == width - i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
