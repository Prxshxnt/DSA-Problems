import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String result = (age > 18) ? "Adult" : "Minor" ;
        System.out.println(result);

        System.out.println(age instanceof Integer );

    }

}
