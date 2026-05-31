package PracticeSet2;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sq = number*number;

        int cube = number*number*number;

        System.out.println("Square: "+ sq +"\n"+ "Cube: " + cube);
    }
}
