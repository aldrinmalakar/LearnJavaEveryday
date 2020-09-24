package ClassWork092320;

import java.util.Scanner;

public class FindOutLargestNumber {

    public static void methodToCall(){

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter Your First Number Of Choice ");
        int input = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter Your Second Number Of Choice ");
        int input2 = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter Your Third Number Of Choice ");
        int input3 = num3.nextInt();

        if( num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest Number");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest Number");

        } else {
            System.out.println(num3+" is the largest Number");
    }



    public static void main(String[] args) {

    FindOutLargestNumber.methodToCall();

    }
}
