package com.connection.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeePayroll")
public class Employeepayroll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column()
	private String ename;
	private long netSalary;//in-hand
	private int deduction;
	private int grossSalary;//total salary in number	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(long netSalary) {
		this.netSalary = netSalary;
	}
	
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getDeduction() {
		return deduction;
	}
	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	
	
	
}
