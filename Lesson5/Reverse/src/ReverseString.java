/**
 * Created by DyXx on 16.02.2017.
 */
public class ReverseString {
    public String reverse(String s) {
        char[] string = new char[s.length()];
        for (int j = 0; j < string.length; j++) {
            string[j] = s.charAt(s.length()-1-j);
        }
        return new String(string);
    }

    public String reverse(int number) {
        return reverse(String.valueOf(number));
    }
}

