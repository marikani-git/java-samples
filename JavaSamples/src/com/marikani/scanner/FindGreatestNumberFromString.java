package com.marikani.scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindGreatestNumberFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello  " + name);
        sc.close();

        String data = "15a2b345c67d8e5,9#10";
        Scanner sc1 = new Scanner(data);
        System.out.println("Enter your name");
        sc1.useDelimiter("\\D");
        List numbers = new ArrayList();
        while (sc1.hasNext()) {
            numbers.add(Integer.parseInt(sc1.next()));
        }
        if (numbers != null && numbers.size() > 0) {
            System.out.println(numbers);
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println(numbers.get(0));
        }
        sc1.close();
    }
}
