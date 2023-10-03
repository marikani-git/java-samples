package com.marikani.basics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingTest {

    public static void main(String[] args) throws IOException {

        try {
            testException(-5);
            /**
             * This line won't execute, after the exception thrown by runtime line below won't be executed inside try block
             */
            testException(15);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally block is executed");
        }
        System.out.println("back to normal execution flow..");
        testException(5);
    }

    public static void testException(int value) throws FileNotFoundException, IOException {
        if (value < 0) {
            System.out.println("Before throwing FilNotFoundException");
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Negative value passed");
            throw fileNotFoundException;
        } else if (value > 10) {
            System.out.println("Before throwing IOExeception");
            IOException ioException = new IOException("value is greater than 10");
            throw ioException;
        }
        System.out.println("No exception occcured for the value --> " + value);
    }
}
