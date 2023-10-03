package org.marikani.oops;

public class ClassAndObject {
    public static void main(String[] args) {
        // Object
        // Any entity which has state and behavior is called an Object
        // An object is an instance of class

        /**
         * Class
         * Collection f object is called class
         * It is a logical entity
         * It is a blueprint or structural definition of an object
         * It won't consume any memory space until unless we created an object from the class
         */

        Department department = new Department();
        department.setDeptId(101);
        department.setDeptName("IT");

        Employee employee = new Employee();
//        employee.setEmpId(1001);
//        employee.setEmpName("Yamuna");
//        employee.setEmpGender(Gender.FEMALE);
//        employee.setSalary(25000.45);
//        employee.setDepartment(department);

        System.out.println("Employee Details");
        System.out.println("================");
        System.out.println("id: " + employee.getEmpId());
        System.out.println("id: " + employee.getEmpId() + " name: " + employee.getEmpName() + " gender: " + employee.getEmpGender() + " salary: " + employee.getSalary() );
//        System.out.println("id: " + employee.getEmpId() + " name: " + employee.getEmpName() + " gender: " + employee.getEmpGender().toString() + " salary: " + employee.getSalary() + " department " + employee.getDepartment().getDeptName());

        employee.displayAnnualSalary();
    }
}
