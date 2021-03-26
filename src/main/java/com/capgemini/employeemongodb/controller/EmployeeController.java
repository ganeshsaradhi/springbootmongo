package com.capgemini.employeemongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeemongodb.model.Employee;
import com.capgemini.employeemongodb.service.EmployeeService;

@RestController
@RequestMapping("/employee/v1")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/{id}")
	public List<Employee> getAll() {

		return service.getAll();

	}

	@PostMapping("/add")
	public List<Employee> add() {

		return service.add();

	}

	@PutMapping("/")
	public List<Employee> update() {

		return service.update();

	}

	@DeleteMapping("/")
	public List<Employee> delete() {

		return service.delete();

	}

}
