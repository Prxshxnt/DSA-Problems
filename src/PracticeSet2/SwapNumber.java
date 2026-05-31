package PracticeSet2;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();

        //with third variable

//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println(num1 + "  " + num2);


//        without third var using arithmetic
//
//          num1 = num1 + num2;
//          num2 = num1 - num2;
//          num1 = num1 - num2;
//
//        System.out.println(num1 + "  " + num2);

//        with XOR

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println(num1 + "  " + num2);

    }
}
