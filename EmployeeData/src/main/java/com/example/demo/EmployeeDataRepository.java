package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public class EmployeeDataRepository {

	@Autowired
	private EmployeeDataInterface factory;

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<Employee>();

		factory.findAll().forEach(employees::add);

		return employees;

	}

	public void addEmployee(Employee employee) {
		factory.save(employee);
	}

	public Employee getEmployeeByID(String id) {

		
		Optional<Employee> employee = null;
		employee = factory.findById(id);
		Employee emp=employee.get();
		return emp;
	}

}
