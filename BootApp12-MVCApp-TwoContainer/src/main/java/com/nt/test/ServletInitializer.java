package com.nt.test;

import org.springframework.boot.builder.SpringApplicationBuilder;

import com.nt.config.WebAppConfig;

public class ServletInitializer extends org.springframework.boot.web.support.SpringBootServletInitializer {

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RootAppConfig.class, WebAppConfig.class);
	}

}
