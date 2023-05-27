package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("Java")
public class JavaCourse implements ICourseMangmnt {
	
	public JavaCourse() {
		System.out.println("Zero Param Constructor of Java Class");
	}

	@Override
	public String courseContent() {
		System.out.println("java Course content method invoked");
		return "jave, Opps,java alng pkg,array, string,exception, Collection,ineer class,generics";
	}

	@Override
	public Double Price() {
		System.out.println("Java price method invoked");
		return 500.00;
	}

}
