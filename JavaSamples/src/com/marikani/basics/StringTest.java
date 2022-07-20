package com.marikani.basics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        // String without creating instance
        System.out.println("String without creating instance");
        String s1 = "abc";
        String s2 = "abc";
         if (s1 == s2) {
             System.out.println("true");
         } else {
             System.out.println("false");
         }
        System.out.println("-----------------------------------");
        System.out.println("                                     ");

        System.out.println("String comparison by creating instance");
        String test1 = new String("abc");
        String test2 = new String("abc");
        if (test1 == test2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("-----------------------------------");
        System.out.println("                                     ");

        System.out.println("String comparison by creating instance compare by equals method");
        if (test1.equals(test2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("-----------------------------------");
        System.out.println("                                     ");

        Integer[] numbers = {112, 312, 34, 145, 16, 54, 78};
        Arrays.stream(numbers).map(String::valueOf).filter(s -> s.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
