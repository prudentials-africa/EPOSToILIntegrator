package com.af.prud.mapper.epostoil;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.af.prud.model.il.CLICRPIREC;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

/**
 * @param <S>
 * 
 */
@Component
public class OrikaModelMapper implements ModelMapper {

	private MapperFacade mapper;
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	ConverterFactory converterFactory = mapperFactory.getConverterFactory();
	
	public OrikaModelMapper() {
		converterFactory.registerConverter("createClientIdValue", new CreateClientCustomConverter());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object map(Object source, Class sourceClass, Class targetClass, Map<String, String> map) {
		ClassMapBuilder<Object, Object> classMapBilder = mapperFactory.classMap(sourceClass,targetClass);
		if(!map.isEmpty()) {
			for(Map.Entry<String,String> s : map.entrySet()) {
				classMapBilder.field(s.getKey(),s.getValue());
			}
		}
		classMapBilder.fieldMap("dateOfBirth","CLTDOBX").converter("createClientIdValue").add().byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
