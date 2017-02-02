import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by DyXx on 02.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner operand = new Scanner(System.in);
        System.out.println("Welcome to ArithmeticalAverage program.");
        System.out.println("Please enter first nubmer : ");
        double firstOperand = operand.nextDouble();

        System.out.println("Please enter second nubmer : ");
        double secondOperand = operand.nextDouble();

        System.out.println("Average is " + ArithmeticalAverage.calculate(firstOperand,secondOperand));
    }


}
