package com.shikhara.Lamdha;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;



public class LambdaBiPredicate {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10);

       
        BiPredicate<Integer, Integer> bothEven = (a, b) -> (a % 2 == 0) && (b % 2 == 0);

        for (int i = 0; i < numbers1.size(); i++) {
            int num1 = numbers1.get(i);
            int num2 = numbers2.get(i);

            if (bothEven.test(num1, num2)) {
                System.out.println(num1 + " and " + num2 + " are both even.");
            } else {
                System.out.println(num1 + " and " + num2 + " are not both even.");
            }
        }
    }
}
