package com.excelr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Employees;

@RestController
@CrossOrigin("*")

public class EmployeeController {
	
@GetMapping("/employees")
 	public List<Employees> getEmployees(){
	
	ArrayList<Employees> a = new ArrayList<>();
	
	Employees e1  = new Employees(1,"one",10000);
	Employees e2  = new Employees(2,"Two",20000);
	Employees e3 = new Employees(3,"Three",30000);
	Employees e4  = new Employees(4,"Four",40000);
	Employees e5  = new Employees(5,"Five",50000);
	
	a.add(e1);
	a.add(e2);
	a.add(e3);
	a.add(e4);
	a.add(e5);
	
	return a;
	
	
	
	
			
	
}

}
