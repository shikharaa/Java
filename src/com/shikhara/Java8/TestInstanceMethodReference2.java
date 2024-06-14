package com.shikhara.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestInstanceMethodReference2 {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(number -> new MathUtils().square(number))
                                              .collect(Collectors.toList());

        
        squaredNumbers.forEach(System.out::println);
    }
}
