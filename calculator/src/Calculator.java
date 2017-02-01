/**
 * Created by DyXx on 01.02.2017.
 */
public class Calculator {
    public static void calculateBasicOperations(String operation, double operand1, double operand2) {
        double result;
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Sum is " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Difference is " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Multiplication is " + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error.Can't division on zero.");
                } else {
                    System.out.println("Division is " + operand1 / operand2);

                }
                break;
        }
    }
}