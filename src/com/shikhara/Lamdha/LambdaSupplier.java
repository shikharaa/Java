package com.shikhara.Lamdha;



import java.util.function.Supplier;
import java.util.Random;

public class LambdaSupplier {
    public static void main(String[] args) {
       
        Random random = new Random();

       
        Supplier<Integer> randomIntSupplier = () -> random.nextInt(100);

        
        for (int i = 0; i < 5; i++) {
            System.out.println(randomIntSupplier.get());
        }
    }
}
