package com.shikhara.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;






public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        
        MathUtils mathUtils = new MathUtils();

       
        Function<Integer, Integer> squareFunction = number -> mathUtils.square(number);



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);



        List<Integer> squaredNumbers = numbers.stream()
                                              .map(squareFunction)
                                              .collect(Collectors.toList());

       
        squaredNumbers.forEach(System.out::println);
    }
}

