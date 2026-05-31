import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        walkable obj = (steps, isEnable) -> {
//            System.out.println("walking faster: " + steps + "steps " + isEnable);
//            return 2 * steps;
//        };
//        int result = obj.walk(4, true);
//
//        System.out.println("Returned Value: " + result);

        List<String> fruits = List.of("Apple" , "Banana" , "Orange");

//        System.out.println(fruits);


//        List<Integer> fruitsList = fruits
//                .stream()
//                .map(fruit -> fruit.length())
//                .collect(Collectors.toList());
//
//        Set<Integer> fruitsList = fruits
//                .stream()
//                .map(fruit -> fruit.length())
//                .collect(Collectors.toSet());

        Map<String , Integer> fruitsList = fruits
                .stream()
                        .collect(Collectors.toMap(
                                fruit -> fruit,
                                fruit -> fruit.length())

                        );

        System.out.println(fruitsList);

//        Stream<String> stream = fruits.stream();
//        stream
//                .filter(fruit -> fruit.length() < 5 )
//                .sorted()
//                .map(String::length)
//                .forEach(System.out::println);
    }
}

    interface walkable{
        int walk(int steps , boolean isEnable);
    }
