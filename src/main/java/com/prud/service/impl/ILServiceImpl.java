package com.prud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prud.service.ILService;
import com.prud.translator.EposToILTranslator;

@Service
public class ILServiceImpl implements ILService {
	@Autowired
	EposToILTranslator eposToILTranslator;
	public static final String REST_SERVICE_URI = "http://localhost:8099/kafka/send/message";

	public String serviceRequest(String json) {
		String soapEnvelop = eposToILTranslator.generateILRequest(json);
		System.out.println("Envelop " + soapEnvelop);
		return soapEnvelop;
	}

	public String callRestClient(String soapEnvelop) {
		RestTemplate restTemplate = new RestTemplate();
		String responseFromKafka = restTemplate.postForObject(REST_SERVICE_URI, soapEnvelop, String.class);
		System.out.println("responseFromKafka" + responseFromKafka);
		return responseFromKafka;
	}
}
