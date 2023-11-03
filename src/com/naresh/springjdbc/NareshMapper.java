package com.naresh.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class NareshMapper {

	@Autowired
	 JdbcTemplate jdbcTemplate;
	 
	 public int addNareshStudentInfo(NareshStudentInfo nsi) {
		 
		 String query="insert into naresh values(100,'Vikash',800)";
		 
		 return jdbcTemplate.update(query);
		 
		 
	 }
	      
	  
}
