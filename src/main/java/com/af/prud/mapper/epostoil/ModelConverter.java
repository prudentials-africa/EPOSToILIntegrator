package com.af.prud.mapper.epostoil;

import java.util.Map;

public interface ModelConverter {
	//CitiBankDomainModel map(ILDataEntity source);
	//T map(S source);
	Object map(Object source, Class sourceClass,Class targetClass,Map<String,String> map);
}
