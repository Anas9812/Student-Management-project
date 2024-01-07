package com.Studata.service;


import java.util.List;

import com.Studata.models.studentmodels;

public interface serviceINTERFACE {

	String savestudent(studentmodels stu);           // save data

	List<studentmodels> getstudent();                 // fetch data

	List<studentmodels> deletestudent(int id);   // delete data

	studentmodels updatestudent(studentmodels stu);    // update data

	List<studentmodels> getBylocation(String location);  // custome for location

	List<studentmodels> getdistinct(String fullname);        // distinct method



	



	

	
	

	

	

}
