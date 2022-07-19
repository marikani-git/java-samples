package com.marikani.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIDemo {

    static List<Student> studentList;

    static {
        System.out.println("inside static block");
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Arun", 10, 5));
        studentList.add(new Student(2, "Dhan", 10, 10));
        studentList.add(new Student(3, "Nancy", 10, 11));
        studentList.add(new Student(4, "Sathish", 10, 3));
        studentList.add(new Student(5, "Yamuna", 12, 1));
        studentList.add(new Student(6, "Nilan", 10, 2));
    }

    public static void main(String[] args) {
        System.out.println("Student iteration using for each");

        studentList.stream().forEach(student -> {
            System.out.println(student);
        });
        System.out.println("                        ");

        System.out.println("iterate student name only");
        List<String> studentNamesList = studentList.stream().
                map(student -> student.getName()).
                collect(Collectors.toList());
        System.out.println(studentNamesList);
        System.out.println("                        ");

        System.out.println("filter 12th class student");
        List<String> studentList12 = studentList.stream().
                filter(student -> student.getClassStudy() == 12).
                map(student -> student.getName()).
                collect(Collectors.toList());
        System.out.println(studentList12);
        System.out.println("                        ");

        System.out.println("lowest rank student from all classes");
        Student lowestRankStudent = studentList.stream().max((student1, student2) -> student1.getRank() > student2.getRank() ? 1 : -1).get();
        System.out.println(lowestRankStudent);
        System.out.println("                        ");

        System.out.println("highest rank student from all classes");
        Student highestRankStudent = studentList.stream().min((student1, student2) -> student1.getRank() > student2.getRank() ? 1 : -1).get();
        System.out.println(highestRankStudent);
        System.out.println("                        ");

        System.out.println("number of students in class 10th");
        long noOfTenthClassStudent = studentList.stream().filter(student -> student.getClassStudy() == 10).count();
        System.out.println(noOfTenthClassStudent);
        System.out.println("                        ");

        System.out.println("filter 10th class student ordered by rank");
        studentList.stream().
                filter(student -> student.getClassStudy() == 10).
                sorted((student1, student2) -> student1.getRank() > student2.getRank() ? 1 : -1).
                limit(2).
                forEach(System.out::println);
        System.out.println("                        ");

        System.out.println(studentList.stream().
                filter(student -> student.getClassStudy() == 10).
                sorted((student1, student2) -> student1.getRank() > student2.getRank() ? 1 : -1).
                findFirst());

        System.out.println(studentList.stream().
                filter(student -> student.getClassStudy() == 10).
                sorted((student1, student2) -> student1.getRank() > student2.getRank() ? 1 : -1));
    }
}
