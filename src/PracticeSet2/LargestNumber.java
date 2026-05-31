package PracticeSet2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of First No: ");
        int firstNo = sc.nextInt();

        System.out.print("Enter the value of second No: ");
        int secondNo = sc.nextInt();

        System.out.print("Enter the value of third No: ");
        int thirdNo = sc.nextInt();

        if (firstNo > secondNo && firstNo > thirdNo) {
            System.out.println(firstNo + " is Greater. ");
        }
        else if (secondNo > firstNo && secondNo > thirdNo) {
                    System.out.println(secondNo + " is Greater. ");
                }
        else {
                    System.out.println(thirdNo + " is Greater. ");
                }
            }
        }
