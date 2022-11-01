package com.connection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connection.entities.Employeepayroll;
import com.connection.repository.employeeRepository;

@Service
public class EmployeepayrollServiceImpl implements EmployeePayrollService {

	@Autowired
	private employeeRepository empRepo;
	
	public void saveData(Employeepayroll data) {
		empRepo.save(data);
	}
	
}
