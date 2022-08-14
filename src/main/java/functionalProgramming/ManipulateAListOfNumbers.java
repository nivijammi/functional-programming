package functionalProgramming;

import java.util.List;

public class ManipulateAListOfNumbers {
    private static void printSquares(List<Integer>numbers){
        //take each element and map it to the square of the element
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);

    }
    private static void printCubeOfOddNumbers(List<Integer>numbers){
        numbers.stream()
                .filter(number ->number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer>numbers = List.of(12,9,13,4,6,2,4,12,15);
        printSquares(numbers);
        printCubeOfOddNumbers(numbers);

    }
}
