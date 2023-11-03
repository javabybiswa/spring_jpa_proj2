package com.naresh.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.naresh.springjdbc")
public class DatabaseConfiguration {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		    datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		   datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		   datasource.setUsername("system");
		   datasource.setPassword("tiger");
		return new JdbcTemplate(datasource);
			 
		 }
	}
	  