package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.bean.Student;

@SpringBootApplication
@ImportResource("com/nt/cfg/applicationContext.xml")
public class BootDIByusingStategyPatt {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootDIByusingStategyPatt.class, args);
		Student stu=ctx.getBean("st",Student.class);
		String res=stu.preparetionOfTopic("Walmart Interview");
		System.out.println(res);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
