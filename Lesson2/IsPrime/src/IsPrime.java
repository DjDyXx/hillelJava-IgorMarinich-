import java.util.Scanner;

/**
 * Created by DyXx on 12.02.2017.
 */
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter number , please : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println("This number is prime.");
        }else{
            System.out.println("This number is NOT prime.");
        }
    }

    private static boolean isPrime(int number) {
        number =  Math.abs(number);
        if (number==0 || number == 1){
            return false;
        }
        for(int i = 2; i < number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
