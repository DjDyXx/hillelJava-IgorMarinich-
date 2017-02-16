import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by DyXx on 12.02.2017.
 */
public class FibonachiRecursia {
    public static void main(String[] args) {
        System.out.println("Enter pls your number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        BigInteger[] array = new BigInteger[0];
        System.out.println("The -i number in the row Fibonacci : " + recursia(number,array));
    }

    private static BigInteger recursia(int number, BigInteger[] array) {
        if (number == 0) {
            return array[0];
        } else if (number == 1) {
            return array[1];
        } else {
            if (isNumberInArray(number, array)) {
                return getValueOfNumber(number, array);
            } else {
                BigInteger result = recursia(number - 1, array).add(recursia(number - 2, array));
                putNumberInArray(number, result, array);
                return result;
            }
        }
    }

    private static BigInteger getValueOfNumber(int number, BigInteger[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == number) {
                return array[number];
            }
        }
        return null;
    }

    private static boolean isNumberInArray(int number, BigInteger[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    private static void putNumberInArray(int number, BigInteger result, BigInteger[] array) {
        if (number > 1) {
            BigInteger[] newArray = new BigInteger[number + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (i == number) {
                    newArray[i] = result;
                } else {
                    newArray[i] = array[i];
                }
            }
            array = newArray;
        }
    }
}
