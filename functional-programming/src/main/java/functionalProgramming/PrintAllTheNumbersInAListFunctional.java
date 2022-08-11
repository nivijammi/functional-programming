package functionalProgramming;

import java.util.List;

public class PrintAllTheNumbersInAListFunctional {
    //print all the numbers in a list(Structured approach)
    public static void main(String[] args) {

        //create a list of numbers
        printAllNumbersInList(List.of(12,9,13,4,6,2,4,12,15));

    }
    //prints the number
    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        //instead on focusing on how to loop we focus on what to do
        //we need to convert list of numbers to stream of numbers
        //ex: 12 9 13 4 6 2 4 12 15  to stream

        //12
        //9
        //13
        //4

        //how to loop all the numbers - traditional way
        //for(int number : numbers){
        //System.out.print("the numbers in the list are: "+ number + " ");
        //}

        //we want to create a stream or sequence of number
        //after we get the stream of number
        // for each number we want to call the print method
        //to define what is to be done when we get the number we use method reference

        //take numbers convert to stream for each element do a print
        numbers.stream()
                .forEach(PrintAllTheNumbersInAListFunctional::print);// class::method
    }
}


