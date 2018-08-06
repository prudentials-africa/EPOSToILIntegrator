package com.af.prud.mapper.epostoil;

import java.util.Map;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

/**
 * @param <S>
 * 
 */
@Component
public class OrikaModelConverter implements ModelConverter {

	private MapperFacade mapper;
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

	public OrikaModelConverter() {
		
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
		classMapBilder.byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
