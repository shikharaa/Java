package com.shikhara.Lamdha;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Mary");

        
        Consumer<String> printName = name -> System.out.println(name);

        
        names.forEach(printName);
    }
}
