package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Employee;

public interface EmployeeDataInterface extends CrudRepository<Employee, String> {

}
