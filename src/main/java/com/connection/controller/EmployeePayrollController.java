package com.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connection.entities.Employeepayroll;
import com.connection.services.EmployeepayrollServiceImpl;

@Controller
public class EmployeePayrollController {
	
	@Autowired
	private EmployeepayrollServiceImpl serviceimpl;

	@RequestMapping("/home")
	public String inputPage() {
		
		return "home_page";
	}
	@RequestMapping("/singleDetails")
	public String allDetails(@ModelAttribute("data")Employeepayroll data,ModelMap model) {
		serviceimpl.saveData(data);
		model.addAttribute("data", data);
		return "allEmpData";
	}
	
	@RequestMapping("/allDetails")
	public String showAllRecords() {
		
		return "";
	}
}
