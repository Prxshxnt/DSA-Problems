package PracticSet;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        int day = 7;

        switch (day){

            case 1: {
                System.out.println("Monday");
                break;
            }

            case 2:{
                System.out.println("Tuesday");
                break;
            }

            case 3: {
                System.out.println("Wed");
                break;
            }
            default: {
                System.out.println("Invalid");
            }
        }


//        String valid = (age >=18) ? "You are eligible for vote. " : "You are not eligible for vote. ";
//        System.out.println(valid);

//        Scanner sc = new Scanner(System.in);
//        int age = 19;
//        char gender = 'F';
//
//        if (gender == 'M'){
//
//            if (age >= 18){
//                System.out.println("Age is 18 or greater than 18 and gender is male: ");
//            }
//            else {
//                System.out.println("Age is lessthan 18 but gender is male: ");
//            }
//        }
//        else {
//            System.out.println("You are not a male: ");
//            if (age >= 18){
//                System.out.println("Age is 18 and gender is not male: ");
//            }
//            else {
//                System.out.println("Age is lessthan 18 and gender is not male");
//            }
//    }

}
}
