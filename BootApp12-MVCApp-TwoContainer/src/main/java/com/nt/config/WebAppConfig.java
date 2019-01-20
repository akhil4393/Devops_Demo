package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages = "com.nt.controller")
public class WebAppConfig {

	@Bean
	public SimpleUrlHandlerMapping createSUHMapping() {
		Properties props = new Properties();
		SimpleUrlHandlerMapping suhm = new SimpleUrlHandlerMapping();
		props.put("home.htm", "pvc");
		suhm.setMappings(props);
		suhm.setOrder(Integer.MAX_VALUE - 1);
		return suhm;
	}

	@Bean("pvc")
	public ParameterizableViewController createPVC() {
		ParameterizableViewController pvc = new ParameterizableViewController();
		pvc.setViewName("welcome");
		return pvc;
	}
}
