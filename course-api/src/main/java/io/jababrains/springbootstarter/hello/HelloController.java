package io.jababrains.springbootstarter.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${welcomeMessage}")
	String welcomeMessage;
	
	
	@Value("${welcome.message}")
	String welcomeMessage2;
	
	
	@RequestMapping(value="/hello")
	public String sayHello() {
		return welcomeMessage+welcomeMessage2;
	}
}
