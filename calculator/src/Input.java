import java.util.Scanner;

/**
 * Created by DyXx on 01.02.2017.
 */
public class Input {

    public static double getOperand1() {
        Scanner op1 = new Scanner(System.in);
        double operand1 = op1.nextDouble();
        isOperandNumber(operand1);
        return operand1;
    }


    public static double getOperand2() {
        Scanner op1 = new Scanner(System.in);
        double operand2 = op1.nextDouble();
        isOperandNumber(operand2);
        return operand2;
    }


    public static String getOperation() {
        Scanner getoper = new Scanner(System.in);
        String getoperation = getoper.nextLine();
        isOperationTrue(getoperation);
        return getoperation;
    }


    private static void isOperandNumber(double operand) {
        boolean result = false;
        while (!result) {
            if (operand == 0) {
                result = true;
            } else {
                System.out.println("Error.Operand isn't number . Try again please : ");
                Scanner op = new Scanner(System.in);
                operand = op.nextDouble();
            }
        }
    }

    private static void isOperationTrue(String getoperation) {
        boolean result = false;
        while (!result) {
            if (getoperation.equals("+") || getoperation.equals("-")
                    || getoperation.equals("*") || getoperation.equals("/")) {
                result = true;
            } else {
                System.out.println("Error.Your operation false. Try again please : ");
                Scanner getoper = new Scanner(System.in);
                getoperation = getoper.nextLine();
            }
        }
    }
}
