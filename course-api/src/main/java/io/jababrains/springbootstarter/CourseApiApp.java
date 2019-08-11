package io.jababrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:production.properties")

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class,args);
		
	}

}
