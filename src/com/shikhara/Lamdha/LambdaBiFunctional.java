package com.shikhara.Lamdha;
import java.util.function.BiFunction;

public class LambdaBiFunctional {
    public static void main(String[] args) {
        
        BiFunction<String, String, String> concatenate = (a, b) -> a + b;       
        String result = concatenate.apply("Shikhara", "Reddy");
        System.out.println(result);
    }
}

