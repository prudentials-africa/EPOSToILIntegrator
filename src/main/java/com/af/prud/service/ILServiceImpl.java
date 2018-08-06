package com.af.prud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.prud.translator.EposToILTranslator;
@Service
public class ILServiceImpl {
	@Autowired
	EposToILTranslator eposToILTranslator;
	public static String CLIENT_BODY ;
	
	public void serviceRequest(String json) {
		CLIENT_BODY =  eposToILTranslator.generateILRequest(json);
		System.out.println("Envelop "+CLIENT_BODY);
	}
}
