import java.util.Scanner;

/**
 * Created by DyXx on 31.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner opperands = new Scanner(System.in);
        System.out.println("Please input first number : ");
        int opperand1 = opperands.nextInt();
        System.out.println("Please input second number : ");
        int opperand2 = opperands.nextInt();

        int sum = opperand1+opperand2;
        int diff = opperand1-opperand2;
        int multiply = opperand1*opperand2;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
        System.out.println("Multiplication is " + multiply);
        if(opperand2 == 0){
            System.out.println("Error.Can't division on zero.");
        }else {
            System.out.println("Division is " + opperand1 / opperand2);
        }
    }
}
