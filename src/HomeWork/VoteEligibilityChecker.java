package HomeWork;

import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Que:- Enter your age...");
        int age = sc.nextInt();

        if (age >=18){
            System.out.println("Ans:- He/She is eligible for vote. ");
        }
        else {
            System.out.println("Ans:- He/She is not eligible for vote. ");
        }
    }
}
