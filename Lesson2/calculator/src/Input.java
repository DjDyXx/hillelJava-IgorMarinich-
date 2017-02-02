import java.util.Scanner;

/**
 * Created by DyXx on 01.02.2017.
 */
public class Input {

    public static double getOperand1() {
        Scanner op1 = new Scanner(System.in);
        String operand1 = op1.next();
        isNumeric(operand1);
        while (!isNumeric(operand1)) {
            System.out.println("Error.Operand №1 isn't number . Try again please : ");
            operand1 = op1.next();
        }
        return Double.parseDouble(operand1);
    }

    public static double getOperand2() {
        Scanner op2 = new Scanner(System.in);
        String operand2 = op2.next();
        isNumeric(operand2);
        while (!isNumeric(operand2)) {
            System.out.println("Error.Operand №2 isn't number . Try again please : ");
            operand2 = op2.next();
        }
        return Double.parseDouble(operand2);
    }


    public static String getOperation() {
        Scanner getoper = new Scanner(System.in);
        String operation = getoper.nextLine();
        isOperationTrue(operation);
        return operation;
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

    private static boolean isNumeric(String operand) throws NumberFormatException {
        try {
            Double.parseDouble(operand);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
