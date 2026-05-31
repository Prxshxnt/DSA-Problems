package HomeWork;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Subjects. ");
        int NoOfSubject = sc.nextInt();

        System.out.print("Enter the marks of Hindi: ");
        int Hindi = sc.nextInt();

        System.out.print("Enter the marks of English: ");
        int English = sc.nextInt();

        System.out.print("Enter the marks of Maths: ");
        int Maths = sc.nextInt();

        System.out.print("Enter the marks of Physics: ");
        int Physics = sc.nextInt();

        System.out.print("Enter the marks of Chemistry: ");
        int Chemistry = sc.nextInt();



        int total = Hindi + English + Maths + Physics + Chemistry;
        double percentage = (double) total /NoOfSubject;

        System.out.print("Total Marks: "+total + " Percentage: " + percentage + "%");

    }
}
