package com.af.prud.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
@Configuration
public class PropertyBeanConfig {
	@Bean(name = "eposToILMappingProperty")
	public static PropertiesFactoryBean eposToILMappingProperty() {
	        PropertiesFactoryBean bean = new PropertiesFactoryBean();
	        bean.setLocation(new ClassPathResource(
	                "epos-to-il-mapping.properties"));
	        return bean;
	}
}
