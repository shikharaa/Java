package com.shikhara.Java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;



 class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

 

 public class ConsturctorReference {
     public static void main(String[] args) {
        
         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

       
         List<Person> persons = names.stream()
                                     .map(Person::new)
                                     .collect(Collectors.toList());

         
         persons.forEach(person -> System.out.println(person.getName()));
     }
 }
