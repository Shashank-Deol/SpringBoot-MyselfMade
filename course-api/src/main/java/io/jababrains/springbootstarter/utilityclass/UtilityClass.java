package io.jababrains.springbootstarter.utilityclass;

import org.springframework.stereotype.Component;

@Component
public class UtilityClass {
	
	public String changeToBold(String name) {
		return name.toUpperCase();
	}
	
}
