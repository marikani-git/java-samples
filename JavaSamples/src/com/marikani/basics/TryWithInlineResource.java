package com.marikani.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithInlineResource {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\source\\resources\\test.txt"))) {
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException fe) {
            fe.printStackTrace();
        }
    }
}
