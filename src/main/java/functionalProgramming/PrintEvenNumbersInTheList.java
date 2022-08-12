package functionalProgramming;

import java.util.List;

public class PrintEvenNumbersInTheList {
    public static void main(String[] args) {

        //create a list of numbers
        printAllEvenNumbersInList(List.of(12,9,13,4,6,2,4,12,15));

    }
    //instead of this method and then calling we can do lambda expression
    /**private static boolean isEven(int number){
        return number%2==0;
    }
     **/
    //

    //in this method you want to take a parameter number and check if it is even and return it back

    /**
     * number -> number%2 == 0
     */
    private static void printAllEvenNumbersInList(List<Integer> numbers) {

        /*
        for(number : numbers){
        if(number%2==0){
        System.out.println(number);
         */
        // what to do?
        //to allow only even numbers add filter
        numbers.stream() //list to a stream of numbers
                //.filter(PrintEvenNumbersInTheList::isEven)//filter will only allow even numbers
                //lambda method is a simpler way of defining a method
                .filter(number -> number%2 == 0)// lambda Expression
                .forEach(System.out::println);// class::method-method reference


    }
}
