package com.shikhara.Lamdha;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LambdaBiConsumer {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Peter", 30);
        ages.put("Paul", 25);
        ages.put("Mary", 28);

       
        BiConsumer<String, Integer> printEntry = (name, age) -> System.out.println(name + ": " + age);
        ages.forEach(printEntry);
    }
}
