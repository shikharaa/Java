package com.shikhara.CF;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUitl {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kala");
        list.add("Ajj");
        list.add("KJJ");

       
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

       
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        
        Collections.sort(list); 
        int index = Collections.binarySearch(list, "Kala");
        System.out.println("Index of 'Kala': " + index);

       
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);
        unmodifiableList.add("New Element"); //  UnsupportedOperationException
    }
}
