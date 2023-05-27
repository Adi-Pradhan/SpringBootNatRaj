package com.nt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("st")
public final class Student {
    @Autowired
    @Qualifier("courseId")
	private ICourseMangmnt topic;
    
    public Student() {
    	System.out.println("zero param consrtuctor of student class");
    }
	
	public String preparetionOfTopic(String examName) {
		System.out.println("Student methos is invoked");
		String topicName=topic.courseContent();
		Double price=topic.Price();
		return"naresh It have to prepare people regarding "+topicName +", for this student have to Pay"+price;
	}
	
}
