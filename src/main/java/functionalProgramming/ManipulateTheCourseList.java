package functionalProgramming;

import java.util.List;

public class ManipulateTheCourseList {
    private static void printCoursesIndividually(List<String>courses){
        /*for(String course:courses){
        if(course.contains("Spring){
           System.out.println(course);
        }
        if(course.length()>3){
        System.out.println(course);

        }*/
        courses.stream()
                .forEach(System.out::println);
    }
    private static void printCoursesContainingTheWordSpring(List<String>courses){
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesHavingAtLeastFourDigits(List<String>courses){
        courses.stream()
                .filter(course -> course.length()>3)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<String>courses = List.of("Spring","Spring Boot","API","Microservices","AMS","PCP","Azure","Docker","Kubernetes");
        //printCoursesIndividually(courses);
        //printCoursesContainingTheWordSpring(courses);
        printCoursesHavingAtLeastFourDigits(courses);

    }
}
