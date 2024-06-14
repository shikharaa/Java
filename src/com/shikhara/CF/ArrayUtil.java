package com.shikhara.CF;


import java.util.Arrays;
import java.util.*;



public class ArrayUtil {

    public static void main(String[] args) {
       
        String[] array = {"Kala", "Ajj", "KJJ"};

       
        System.out.println("Original Array: " + Arrays.toString(array));

        
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

       
        int index = Arrays.binarySearch(array, "Kala");
        System.out.println("Index of 'Kala': " + index);

       
        List<String> list = Arrays.asList(array);
        System.out.println("Array as List: " + list);
    }
}
