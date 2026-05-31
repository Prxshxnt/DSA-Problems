package PracticeSet2;

import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number>0){
            System.out.println(number+ " is Positive.");
        } else if (number<0) {
            System.out.println(number+ " is Negative.");
        }else {
            System.out.println(number + " is Zero.");
        }
    }
}
