package io.jababrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@Configuration
@PropertySource(value = "classpath:production.properties")
*/

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class,args);
		
	}

}
