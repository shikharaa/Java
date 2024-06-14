package com.shikhara.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


class MathUtils {
    public static int square(int number) {
        return number * number;
    }
}


public class MethodReferenceStatic {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);



        Function<Integer, Integer> squareFunction = MathUtils::square;

     //   Function<Integer, Integer> squareFunction = number -> MathUtils.square(number);

        List<Integer> squaredNumbers = numbers.stream()
                                              .map(squareFunction)
                                              .collect(Collectors.toList());



        
        squaredNumbers.forEach(System.out::println);
    }
}
