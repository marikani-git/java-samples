package com.marikani.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // Try block without resource
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\source\\resources\\test.txt"));
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
