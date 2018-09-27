import java.util.Scanner;

public class CaeserCipher {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String code;
        String message;
        String cipher = "";

        System.out.println("Type a message: ");
        message = scan.nextLine();

        System.out.println("Type a code word: ");
        code = scan.nextLine();

        for (int count = 0; count < message.length(); count++)  {
            char chr = message.charAt(count);
            int value = (int) chr;

            // System.out.println((count / code.length()) * code.length());

            char codeChr = code.charAt(count - ((count / code.length()) * code.length()));
            int shift = ((int) codeChr) - 96;
            value = value + shift;

            if (value > 122)    {
                value = 96 + (value - 122);
            }
            cipher = cipher + ((char) value);
        }

        System.out.println("Encrypted version: " + cipher);
    }
}