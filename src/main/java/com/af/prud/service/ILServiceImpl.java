package com.af.prud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.prud.translator.EposToILTranslator;
@Service
public class ILServiceImpl {
	@Autowired
	EposToILTranslator eposToILTranslator;
	
	public String serviceRequest(String json) {
		String soapEnvelop =  eposToILTranslator.generateILRequest(json);
		System.out.println("Envelop "+soapEnvelop);
		return soapEnvelop;
	}
}
