package org.example.Example1.betterCode;

public class Employee {
    private String name;
    private int id;
    private EmployeeType employeeType;

    public Employee(String name, int id, EmployeeType employeeType) {
        this.name = name;
        this.id = id;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public double calculateSalary(double baseSalary) {
       return SalaryCalculator.calculateSalary(employeeType.name(), baseSalary);
    }
}
