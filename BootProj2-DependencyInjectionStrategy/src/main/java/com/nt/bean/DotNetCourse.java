package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("Dot")
public final class DotNetCourse implements ICourseMangmnt {
	
	public DotNetCourse() {
		System.out.println("Zero Param Constructor of DotNet Class");
	}

	@Override
	public String courseContent() {
		System.out.println("DotNet Course content method invoked");
		return "C#, oops,collection,exception";
	}

	@Override
	public Double Price() {
		System.out.println("DotNet price method invoked");
		return 400.00;
	}

}
