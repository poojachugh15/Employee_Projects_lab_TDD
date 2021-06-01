package com.example.codeclan.employeeprojects.employeeprojects;

import com.example.codeclan.employeeprojects.employeeprojects.models.Department;
import com.example.codeclan.employeeprojects.employeeprojects.models.Employee;
import com.example.codeclan.employeeprojects.employeeprojects.models.Project;
import com.example.codeclan.employeeprojects.employeeprojects.repositories.DepartmentRepository;
import com.example.codeclan.employeeprojects.employeeprojects.repositories.EmployeeRepository;
import com.example.codeclan.employeeprojects.employeeprojects.repositories.ProjectsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeprojectsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;


	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectsRepository projectsRepository;



	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeDepartment() {
		Department department = new Department("Software Development");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Ahmet", "Giritli", 786, department);
		employeeRepository.save(employee1);

	}

	@Test
	void addEmployeeProjects() {
		Department department = new Department("Software Development");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Ahmet", "Giritli", 786, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Music Quiz", 10);
		projectsRepository.save(project1);

		project1.addEmployee(employee1);
		projectsRepository.save(project1);

	}

}
