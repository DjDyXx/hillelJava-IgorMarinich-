import java.util.Scanner;

/**
 * Created by DyXx on 31.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator 3000");

        System.out.println("Please input first number : ");
        Input.getOperand1();

        System.out.println("Please input second number : ");
        Input.getOperand2();

        System.out.println("Please eneter an operation : ");

        Input.getOperation();

    }
}
