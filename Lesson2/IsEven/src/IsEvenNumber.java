import java.util.Scanner;

/**
 * Created by DyXx on 12.02.2017.
 */
public class IsEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter number please : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isEven(number)){
            System.out.println("Yes , this number even.");
        }else{
            System.out.println("This number is not even.");
        }
    }

    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
