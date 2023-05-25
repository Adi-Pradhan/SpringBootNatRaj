package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.bean.WishMessageGen;

@SpringBootApplication
public class BootProj1DependencyInjectionApplication {
	@Bean(name="idt")
	public LocalDateTime getLocalDateTime() {
		System.out.println("Dependent bean instatiated");
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(BootProj1DependencyInjectionApplication.class, args);
		WishMessageGen res=ctx.getBean("wmg", WishMessageGen.class);
		String result=res.generateWishMessage("Aditya");
		System.out.println(result);
	}

}
