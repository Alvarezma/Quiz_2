public class ThriceSim {

    public static void main ( String[] args ) {
        
        long total = 0;
        // double tempAver;
        double average = 0.0;

        for (int plays = 1; plays <= 1000; plays++)   {

            long tally = 0;
            long value = 0;
            int tripWorth = 0;
            int a = 1;
            int b = 2;
            int c = 3;

            for (int count = 1; !(a == b && b == c); count++)    {
                a = (int)(Math.random()*6 + 1);
                b = (int)(Math.random()*6 + 1);
                c = (int)(Math.random()*6 + 1);
                value = a + b + c;
                if (count % 3 == 0) {
                    tally = tally - value;
                } else {
                    tally = tally + value;
                }
                if (a == b && b == c)   {
                    tripWorth = a;
                }
            }

            for (int count = 1; count <= tripWorth; count++)    {
                a = (int)(Math.random()*6 + 1);
                b = (int)(Math.random()*6 + 1);
                c = (int)(Math.random()*6 + 1);
                value = a * b * c;
                tally = tally + value;
            }

            
            value = 1;
            while (!(a == b && b == c))  {
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

            total = total + tally;
            System.out.println(tally);
            System.out.println("    " + total);
            // if (plays % 10 == 0)   {
            //     tempAver = total / 100.0;
            //     average = average + tempAver;
            //     total = 0;
            // }
        }

        average = total / 1000.0;
        System.out.println("Average over 1000 games: " + average);
    }
}