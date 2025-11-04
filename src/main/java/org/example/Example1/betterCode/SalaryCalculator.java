package org.example.Example1.betterCode;

public class SalaryCalculator {

    public static double calculateSalary(String employeeType, double baseSalary) {
        if (employeeType.equals("FULL_TIME")) {
            return baseSalary;
        } else if (employeeType.equals("PART_TIME")) {
            return baseSalary * 0.5;
        } else if (employeeType.equals("CONTRACTOR")) {
            return baseSalary * 0.8;
        } else {
            throw new IllegalArgumentException("Unknown employee type: " + employeeType);
        }

    }
}
