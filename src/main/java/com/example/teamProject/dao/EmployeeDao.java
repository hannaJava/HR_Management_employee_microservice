package com.example.teamProject.dao;

import com.example.teamProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
}
