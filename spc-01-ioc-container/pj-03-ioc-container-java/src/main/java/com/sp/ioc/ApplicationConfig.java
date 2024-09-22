package com.sp.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sp.ioc.bean")
public class ApplicationConfig {

	@Bean
	HelloBean helloBean() {
		return new HelloBean();
	}
}
