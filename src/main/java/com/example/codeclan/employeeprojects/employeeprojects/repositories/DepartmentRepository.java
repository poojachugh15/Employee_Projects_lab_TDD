package com.example.codeclan.employeeprojects.employeeprojects.repositories;

import com.example.codeclan.employeeprojects.employeeprojects.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
