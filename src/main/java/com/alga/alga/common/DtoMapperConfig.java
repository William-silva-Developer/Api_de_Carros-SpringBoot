package com.alga.alga.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoMapperConfig {
	
	@Bean
	public ModelMapper model() {
		
		return new ModelMapper();
	}

}
