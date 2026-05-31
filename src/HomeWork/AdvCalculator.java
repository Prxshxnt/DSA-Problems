package HomeWork;

import java.util.Scanner;

public class AdvCalculator {
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

        int min = Hindi;

        if (English < min){
                English = min;
        }

        if (Maths < min){
            Maths = min;
        }
        if (Physics < min){
            Physics = min;
        }
        if (Chemistry < min){
            Chemistry = min;
        }

        int total = Hindi + English + Maths + Physics + Chemistry - min;
        double percentage = (double) total /NoOfSubject;

        System.out.println("Lowest marks is droped: " + min);

        System.out.print("Total Marks of best 4 subjects: "+total + " Percentage: " + percentage + "%");
    }
}
