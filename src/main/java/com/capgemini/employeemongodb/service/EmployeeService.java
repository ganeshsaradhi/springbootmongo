package com.capgemini.employeemongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeemongodb.model.Employee;
import com.capgemini.employeemongodb.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	public List<Employee> getAll() {
		return repo.getAll();
	}

	public List<Employee> add() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> update() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
