package com.af.prud.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
@Configuration
public class PropertyBeanConfig {
	@Bean(name = "clientMappingProperty")
	public static PropertiesFactoryBean eposToILMappingProperty() {
	        PropertiesFactoryBean bean = new PropertiesFactoryBean();
	        bean.setLocation(new ClassPathResource(
	                "client-to-il-mapping.properties"));
	        return bean;
	}
}
