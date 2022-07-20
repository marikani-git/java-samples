package com.marikani.basics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employeeInfo.txt"));
            Employee employee = (Employee) objectInputStream.readObject();

            System.out.println("Employee details after deserialization");
            System.out.println("=========================================");
            System.out.println("Emp Id \t Employee Name");
            System.out.println("=========================================");

            System.out.println(employee.getId() + "\t \t \t" + employee.getName());
        } catch (Exception e) {

        }
    }
}
