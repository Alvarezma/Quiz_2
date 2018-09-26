import java.util.Scanner;

public class ThriceTurn {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int retire;
        int tally = 0;
        int value = 0;
        int tripWorth = 0;
        int a = 1;
        int b = 2;
        int c = 3;

        for (int count = 1; a != b && b != c; count++)    {
            a = (int)(Math.random()*6 + 1);
            b = (int)(Math.random()*6 + 1);
            c = (int)(Math.random()*6 + 1);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            value = a + b + c;
            if (count % 3 == 0) {
                tally = tally - value;
            } else {
                tally = tally + value;
            }
        }

        tripWorth = a;

        System.out.println("Tally: " + tally);
        System.out.println("Triplet's worth: " + tripWorth);

        for (int count = 1; count <= tripWorth; count++)    {
            a = (int)(Math.random()*6 + 1);
            b = (int)(Math.random()*6 + 1);
            c = (int)(Math.random()*6 + 1);
            value = a * b * c;
            tally = tally + value;
        }

        System.out.println("Tally: " + tally);
        System.out.println("Do you want to retire?");
        System.out.println("type 0 for yes and 1 for no");
        retire = scan.nextInt();

        if (retire == 1)    {
            value = 1;
            while (a != b && b != c)  {
                a = (int)(Math.random()*6 + 1);
                b = (int)(Math.random()*6 + 1);
                c = (int)(Math.random()*6 + 1);
                tally = tally + value;
                if (a == b && b == c && a == tripWorth)   {
                    tally = tally * 3;
                } else if (a == b && b == c)    {
                    tally = a;
                }
                value = value * 3;
            }
        }

        System.out.println("Final tally: " + tally);

    }
}