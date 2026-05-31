public class Practice {
    public static void main(String[] args) {
        int age;
        age = 34;
        System.out.println(age);

        char alphabet = 'c';
        System.out.println((char) (alphabet+2));

        double newage = age;
        System.out.println(newage); // implicit type conversion

        long num = 123456789;
        int newNum = (int)num;
        System.out.println("new number is: " + newNum);
    }
}
