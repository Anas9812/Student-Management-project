package com.Studata.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Studata.models.studentmodels;
import com.Studata.repo.studentrepo;

@Service
public class Studentservice implements serviceINTERFACE {

	@Autowired
	studentrepo repo;
	
	
	@Override
	public String savestudent(studentmodels stu) {
		try {
			repo.save(stu);
			return "Student details stored for id: "+stu.getId();
		}catch(Exception e) {
			System.out.println(e);
			return "Something went wrong";
		}
		
		
	}


	@Override
	public List<studentmodels> getstudent() {
		
		try {
			// return repo.findAll();
				return repo.fetchAllstudent();
			
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}


	@Override
	public List<studentmodels> deletestudent(int id) {
		try {
			repo.deleteById(id);
			return repo.findAll();
		}catch (Exception e) {
			System.out.println(e);
			return null;
			
		}
		
		
		
	}


	@Override
	public studentmodels updatestudent(studentmodels stu) {
		try {
			repo.save(stu);
		//	return repo.findById(stu.getId()).get();
			return repo.getById(stu.getId());
			
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<studentmodels> getBylocation(String location) {
		return repo.findBylocation(location);
	}


	@Override
	public List<studentmodels> getdistinct(String fullname) {
		return repo.findDistinctByfullname(fullname);
	}
		
		
		
	}



	

	

	


	


