package com.marikani.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Hockey");
        gamesList.add("Volleyball");
        gamesList.add("Cricket");

        System.out.println("==========================");
        System.out.println("For each loop demo");
        System.out.println("==========================");
        gamesList.forEach(game -> {
            System.out.println(game);
        });

        System.out.println("=====================================");
        System.out.println("For each demo with method reference");
        System.out.println("=====================================");
        gamesList.forEach(System.out::println);

        System.out.println("==========================");
        System.out.println("For-each-ordered loop demo");
        System.out.println("==========================");
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
