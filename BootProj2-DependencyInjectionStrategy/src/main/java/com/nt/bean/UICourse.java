package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("UI")
public final class UICourse implements ICourseMangmnt {
	
	public UICourse() {
		System.out.println("Zero Param Constructor of UI Class");
	}

	@Override
	public String courseContent() {
		System.out.println("UI Course content method invoked");
		return "html,css,javascript,javax,jscript";
	}

	@Override
	public Double Price() {
		System.out.println("UI price method invoked");
		return 300.00;
	}

}
