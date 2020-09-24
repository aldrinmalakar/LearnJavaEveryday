package ClassWork092320;

import java.util.Scanner;

public class FindOutLargestNumber {

    public static void methodToCall() {

        Scanner numbers = new Scanner(System.in);
        System.out.println( "ENTER THREE NUMBERS OF YOUR CHOICE");
        int x = numbers.nextInt();
        int y = numbers.nextInt();
        int z = numbers.nextInt();

        if (x >= y && x >= z) {
            System.out.println(x  + " is the largest Number");

        } else if (y >= x && y >= z) {
            System.out.println(y + " is the largest Number");

        } else {
            System.out.println(z + " is the largest Number");
        }


    }

    public static void main(String[] args) {
        FindOutLargestNumber.methodToCall();
    }
}