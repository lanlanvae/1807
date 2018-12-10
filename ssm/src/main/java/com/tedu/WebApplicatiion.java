package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.tedu.mapper")
public class WebApplicatiion{

	public class WebApplication extends SpringBootServletInitializer{
		@Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(WebApplication.class);
	    }
	    public void main(String[] args) {
	        SpringApplication.run(WebApplication.class, args);
	    }
	}
}