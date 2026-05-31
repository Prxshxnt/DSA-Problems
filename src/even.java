import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class even {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 6, 4, 5, 3, 7, 8, 12, 10);

        Stream<Integer> stream = list.stream();

        list.stream()
                .sorted()
                .filter(n-> n%2==0)
                .forEach(System.out::println);

    }
}
