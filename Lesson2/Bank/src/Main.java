import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by DyXx on 03.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello,enter please an amount what will be deposited in UAH : ");
        String inputDeposit = sc.nextLine();
        while (!isNumeric(inputDeposit)) {
            System.out.println("Error.It isn't number . Try again please : ");
            inputDeposit = sc.nextLine();
        }
        System.out.println("Enter please Annual Percentage Rate (APR) : ");
        String inputPercentageRate =  sc.nextLine();
        while (!isNumeric(inputPercentageRate)) {
            System.out.println("Error.It isn't number . Try again please : ");
            inputPercentageRate = sc.nextLine();
        }
        System.out.println("How many years? : ");
        String inputPeriod = sc.nextLine();
        while (!isNumeric(inputPeriod)) {
            System.out.println("Error.It isn't number . Try again please : ");
            inputPeriod = sc.nextLine();
        }

        BigDecimal deposit = new BigDecimal(inputDeposit);
        BigDecimal percent = new BigDecimal(inputPercentageRate);
        BigDecimal hundred = new BigDecimal("100");
        BigDecimal realPercent = percent.divide(hundred, 2, RoundingMode.HALF_UP);
        BigDecimal newDeposit = deposit.multiply(realPercent);
        System.out.println("Interest charges(%) for "+inputPeriod+" year(s) = "+newDeposit+" UAH");
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(deposit);
        total = total.add(newDeposit);
        System.out.println("The cumulative amount of money plus % for "+inputPeriod+" year(s) = "+total+" UAH");
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
