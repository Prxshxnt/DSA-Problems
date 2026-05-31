package HomeWork;

import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the uppercase: ");

        String upperCase = sc.nextLine();
        System.out.println(upperCase.toLowerCase());
    }
}
