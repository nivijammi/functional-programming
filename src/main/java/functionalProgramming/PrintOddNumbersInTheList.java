package functionalProgramming;

import java.util.List;

public class PrintOddNumbersInTheList {
    public static void main(String[] args) {
        printAllOddNumbers(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void printAllOddNumbers(List<Integer>numbers){
        numbers.stream()
                .filter(number -> number%2 != 0) // lambda expression
                .forEach(System.out::println);// Method reference
    }
}
