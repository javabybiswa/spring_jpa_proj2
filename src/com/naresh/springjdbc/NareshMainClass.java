package com.naresh.springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class NareshMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		   
	context.scan("com.naresh.springjdbc");
		context.refresh();
		NareshMapper dbOperation=context.getBean(NareshMapper.class);
		   int noOfRowsInserted=dbOperation.addNareshStudentInfo(null);
		   System.out.println("Rows Inserted: +noOfRowsInserted");

	}
}
