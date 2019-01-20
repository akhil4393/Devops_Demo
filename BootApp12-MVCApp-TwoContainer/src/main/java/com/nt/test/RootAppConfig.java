package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.ServiceBeanConfig;

@SpringBootApplication
@Import(value = { ServiceBeanConfig.class })
public class RootAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(RootAppConfig.class, args);
	}
}
