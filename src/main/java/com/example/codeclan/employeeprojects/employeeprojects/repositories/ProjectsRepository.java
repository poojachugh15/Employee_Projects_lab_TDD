package com.example.codeclan.employeeprojects.employeeprojects.repositories;

import com.example.codeclan.employeeprojects.employeeprojects.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Long> {
}
