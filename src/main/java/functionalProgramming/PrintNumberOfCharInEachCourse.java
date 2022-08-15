package functionalProgramming;

import java.util.List;

public class PrintNumberOfCharInEachCourse {
    private static void numberOfCharInEachCourse(List<String>courses){
        courses.stream()
                .map(course-> course + " has " + course.length() + " char")
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String>courses = List.of("Spring","Spring Boot","API","Microservices","AMS","PCP","Azure","Docker","Kubernetes");
        numberOfCharInEachCourse(courses);

    }
}
