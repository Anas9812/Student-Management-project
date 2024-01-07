package com.Studata.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Studata.models.studentmodels;
import com.Studata.service.serviceINTERFACE;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;


@RestController
@RequestMapping("stu")
public class studentcontroller {
	
	@Autowired
	serviceINTERFACE service;
	
	
	@PostMapping("/save")
	public String savestudent(@RequestBody studentmodels stu) {
		return service.savestudent(stu);
	}
	
	
	@GetMapping("/fetch")
	public List<studentmodels> getstudent() {
		return service.getstudent();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public List<studentmodels> deletestudent( @PathVariable  int id) {
		return service.deletestudent(id);
	}
	
	
	@PutMapping("/update/{id}")
	public  studentmodels updatestudent(@RequestBody studentmodels stu) {
		return service.updatestudent(stu);
	}
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
	
	@GetMapping("/fetch/{location}")
	public List<studentmodels> getBylocation (@PathVariable String location) {
		return service.getBylocation(location);
		
	}
	
	@GetMapping("/fetch/fullname")
	public List<studentmodels> getdistinct(@PathVariable String fullname) {
		return service.getdistinct(fullname);
	}
	

	
}


