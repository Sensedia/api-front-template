package com.sensedia.apifront.projectname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.MappedInterceptor;

import com.sensedia.apifront.projectname.interfaces.interceptor.LogInterceptor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public MappedInterceptor requestInterceptorInterceptor() {
		return new MappedInterceptor(new String[] { "/**" }, new LogInterceptor());
	}
}
