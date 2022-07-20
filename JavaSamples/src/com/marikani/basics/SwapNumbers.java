package com.marikani.basics;

public class SwapNumbers {
    public static void main (String[] args) {
        int x = 50;
        int y = 80;
        System.out.println("swap numbers without third variable");
        System.out.println("------------------------------------");

        System.out.println("before swap X and Y is " + x + " " + y);
        x = x+y;
        y = x -y;
        x = x -y;

        System.out.println("after swap X and Y is " + x + " " + y);
    }
}
