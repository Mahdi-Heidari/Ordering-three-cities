package orderthreecities;

import java.util.Scanner;

public class OrderThreeCities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String reserve, a, b, c;

//         Sorts cities in alphabentical order.
        System.out.println("Enter 3 city names:");
        a = input.nextLine();
        b = input.nextLine();
        c = input.nextLine();

        if (a.compareToIgnoreCase(b) < 0) {

            reserve = b;
            b = a;
            a = reserve;

        }
        if (a.compareToIgnoreCase(c) < 0) {

            reserve = c;
            c = b;
            b = a;
            a = reserve;

        }
        if (b.compareToIgnoreCase(c) < 0) {

            reserve = c;
            c = b;
            b = reserve;

        }

        System.out.printf("The cities in alphabentical order are:"
                + "\n%s\t%s\t%s\n\n\n", c, b, a);
        
        //Sorts cities in descending order.
        
        /*   Method 1:
         System.out.printf("The cities in descending order are:"
         + "\n%s\t%s\t%s\n\n\n", a, b, c);
                
         //    Method 2:
         if (a.compareToIgnoreCase(b) > 0) {

         reserve = b;
         b = a;
         a = reserve;

         }
         if (a.compareToIgnoreCase(c) > 0) {

         reserve = c;
         c = b;
         b = a;
         a = reserve;

         }
         if (b.compareToIgnoreCase(c) > 0) {

         reserve = c;
         c = b;
         b = reserve;

         }

         System.out.printf("The cities in descending order are:"
         + "\n%s\t%s\t%s\n\n\n", c,b,a);                
         */

    }

}
