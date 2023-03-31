package com.example.teamProject.service;

import com.example.teamProject.model.Department;
import com.example.teamProject.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);

    Employee getEmployeeByName(String name);

    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int id);

    Department getEmployeeDepartment(int employeeId);
}
