

//Initial program for ArrayList

package com.shikhara.CF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestAL {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Bob")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}

