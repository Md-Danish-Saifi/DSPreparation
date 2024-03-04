package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(20,5,71,8,55,14,70);
        List<Integer> sorted = data.stream().sorted().collect(Collectors.toList());
        System.out.println(data);
        System.out.println(sorted);

        Predicate<Integer> prd = e -> e>55;
        data.stream().filter(prd).sorted().forEach( System.out::println);

        data.stream().filter(prd).sorted().forEach( Sort::printElement);
        System.out.println();
        Sort s = new Sort();
        data.stream().filter(prd).sorted().forEach( s::printElements);

        int number = data.stream().filter(prd).reduce(0,(a,b)-> a+b);
        long numbers = data.stream().filter(prd).reduce(1,(a,b)-> a*b);
        System.out.println("Addition :: "+number);
        System.out.println("Addition :: "+numbers);
        String concatString = data.stream().filter(prd)
                .map(Object::toString)
                .reduce((a, b) -> a + ", " + b)
                .orElse("No elements");
        System.out.println("Concatenated String: " + concatString);

        groupBy();
    }
    public static void printElement(int i){
        System.out.print(i+" ");
    }

    public  void printElements(int i){
        System.out.print(i+" ");
    }
    public static void groupBy(){
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Grapes", "Banana");

        // Grouping by the length of the fruit names
        Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by length: " + groupedByLength);

        // Grouping by the first character of each fruit name
        Map<Character, List<String>> groupedByFirstChar = fruits.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("Grouped by first character: " + groupedByFirstChar);
    }
}
