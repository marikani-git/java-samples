package org.marikani.oops;

public class Employee implements Cloneable{
    private int empId;
    private String empName;
    private double salary;
    private Department department;

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    Employee() {
        super();
    }

    Employee(int empId, String empName, double salary, Gender empGender, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.empGender = empGender;
        this.department = department;
    }

    private Gender empGender;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Gender getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Gender empGender) {
        this.empGender = empGender;
    }

    public double getAnnualSalary() {
        return this.salary*12;
    }

    public void displayAnnualSalary() {
        System.out.println("Annual salary is: " + getAnnualSalary());
    }
}
