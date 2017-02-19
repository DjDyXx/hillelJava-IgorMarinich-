/**
 * Created by DyXx on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Parse newNumber = new Parse();
        String number = Input.number();
        System.out.println(newNumber.parsing(number));
    }
}
