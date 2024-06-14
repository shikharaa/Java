package com.shikhara.Lamdha;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaFunctional {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Mary");

        
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                           .map(toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Names in uppercase: " + upperCaseNames);
    }
}
