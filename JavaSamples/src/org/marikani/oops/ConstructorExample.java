package org.marikani.oops;

public class ConstructorExample {

    /**
     * It is a block of codes which is similar to a method
     * It's should be same as class name
     * It is called when an instance of the class is created
     * At the time of calling the constructor, JVM will allocate the memory for the object
     * Constructor should not have return type     */

    public static void main (String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee(102, "Mari", 233432, Gender.MALE, new Department(1001, "Admin"));
        Employee employee = (Employee)employee1.clone();

        System.out.println("id: " + employee.getEmpId() + " name: " + employee.getEmpName() + " gender: " + employee.getEmpGender().toString() + " salary: " + employee.getSalary() + " department " + employee.getDepartment().getDeptName());
        employee.displayAnnualSalary();


    }
}
