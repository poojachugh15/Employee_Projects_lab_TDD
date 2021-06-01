package com.example.codeclan.employeeprojects.employeeprojects.repositories;

import com.example.codeclan.employeeprojects.employeeprojects.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
