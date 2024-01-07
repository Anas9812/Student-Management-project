package com.Studata.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Studata.models.studentmodels;

@Repository
public interface studentrepo extends JpaRepository<studentmodels, Integer>{
	
	
	public List<studentmodels> findBylocation (String location);
	
	public List<studentmodels> findDistinctByfullname(String fullname);
	
	
//	@Query (value="SELECT e FROM STUDENT e")   JPQL = java persistance query langauge
	
	@Query(value = "select * from studentmodels",nativeQuery = true)
	public List<studentmodels> fetchAllstudent();
	
	
	@Query(value = "select * from studentmodels where id= :id", nativeQuery = true)
	public studentmodels getById(@Param("id")Integer id);
	
	
	
	
}
