package HomeWork;

import java.util.Scanner;

public class LowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lowercase: ");

        String lowerCase = sc.nextLine();
        System.out.println(lowerCase.toUpperCase());
    }
}
