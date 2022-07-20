package com.marikani.basics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;

public class SerializationTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Nilan");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employeeInfo.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Employee object successfully Serialized " + employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
