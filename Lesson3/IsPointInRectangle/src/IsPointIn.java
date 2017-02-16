import java.util.Scanner;

/**
 * Created by DyXx on 12.02.2017.
 */
public class IsPointIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls left-up corner of rectangle.");
        int leftUpCorner = sc.nextInt();
        System.out.println("Enter pls right-down corner of rectangle.");
        int rightDownCorner = sc.nextInt();
        System.out.println("Enter pls coodrinate X : ");
        int x = sc.nextInt();
        System.out.println("Enter pls coodrinate Y : ");
        int y = sc.nextInt();
        if (isPointInRectangle(x, y, leftUpCorner, rightDownCorner)) {
            System.out.println("Yes , this point is in rectangle");
        } else {
            System.out.println("No , this point is NOT in rectangle ");
        }
    }

    private static boolean isPointInRectangle(int x, int y, int leftUpCorner, int rightDownCorner) {
        int counter = 0;
        for (int i = 0; i <=leftUpCorner; i++) {
            if (y == i) {
                counter+=1;
            }
        }
        for (int k = 0; k <=rightDownCorner; k++) {
            if (x == k) {
                counter+=1;
            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}
