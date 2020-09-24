package ClassWork092320;

import java.util.Scanner;

public class CheckEligibilityForVote {

    public static void main(String[] args) {

        CheckEligibilityForVote.eligibility();
    }

    /**
    This Method will check the eligibility to vote
    Author: Aldrin Malakar
    Date: 09/23/20
     */
    public static void eligibility() {
        Scanner age = new Scanner(System.in);
        System.out.println("Please Enter Your Age Below: ");
        int input = age.nextInt();

        if (input>=18){
            System.out.println("Congratulations!!! You Are eligible to vote.");
        } else {
            System.out.println("Sorry, you are still too young to vote!");
        }
    }
}
