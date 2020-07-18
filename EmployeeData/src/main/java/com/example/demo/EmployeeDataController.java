package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;

@RestController
public class EmployeeDataController {

	@Autowired
	private EmployeeDataRepository dataController;

	@GetMapping("/allEmployees")
	public List<Employee> getEmployees() {
		return dataController.getAllEmployees();
	}

	@PostMapping("/addEmployee/{id}/{name}/{address}/{salary}")
	public void addEmployee(@PathVariable String id, @PathVariable String name, @PathVariable String address,
			@PathVariable double salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);

		dataController.addEmployee(emp);

	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return dataController.getEmployeeByID(id);
	}
}
