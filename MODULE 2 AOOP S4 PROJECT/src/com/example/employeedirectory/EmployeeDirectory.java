package com.example.employeedirectory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeDirectory {
    private Map<Integer, Employee> employeeMap = new HashMap<>();
    private Set<Employee> employeeSet = new HashSet<>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        employeeSet.add(employee);
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    public void removeEmployee(int id) {
        Employee employee = employeeMap.remove(id);
        employeeSet.remove(employee);
    }

    public Set<Employee> getAllEmployees() {
        return employeeSet;
    }

    public int getTotalEmployees() {
        return employeeSet.size();
    }
}
