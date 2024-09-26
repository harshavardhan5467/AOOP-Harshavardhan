package com.example.employeedirectory;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Adding employees
        directory.addEmployee(new Employee(1, "Alice", "HR"));
        directory.addEmployee(new Employee(2, "Bob", "IT"));
        directory.addEmployee(new Employee(3, "Charlie", "Finance"));

        // Display all employees
        System.out.println("All Employees:");
        for (Employee employee : directory.getAllEmployees()) {
            System.out.println(employee);
        }

        // Total number of employees
        System.out.println("Total Employees: " + directory.getTotalEmployees());

        // Get employee by ID
        Employee emp = directory.getEmployee(1);
        System.out.println("Retrieved Employee: " + emp);

        // Remove an employee
        directory.removeEmployee(2);
        System.out.println("After removal, Total Employees: " + directory.getTotalEmployees());
    }
}
