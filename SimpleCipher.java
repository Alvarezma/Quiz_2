import java.util.Scanner;

public class SimpleCipher {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String message;
        String cipher = "";
        int shift;

        System.out.println("Type a message: ");
        message = scan.nextLine();

        System.out.println("Ammount of shift: ");
        shift = scan.nextInt();

        for (int count = 0; count < message.length(); count++)  {
            char chr = message.charAt(count);
            int value = (int) chr;
            value = value + shift;
            if (value > 122)    {
                value = 96 + (value - 122);
            }
            cipher = cipher + ((char) value);
        }

        System.out.println("Encrypted version: " + cipher);
    }
}