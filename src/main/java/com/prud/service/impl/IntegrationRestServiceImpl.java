package com.prud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.prud.service.ILService;
import com.prud.service.IntegrationRestService;

@Component
public class IntegrationRestServiceImpl implements IntegrationRestService {
	@Autowired
	private ILService iLService;

	@Override
	public String createILRequest(@RequestBody String json) {
		if (json.isEmpty())
			System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		else
			System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");

		String soapEnvelop = iLService.serviceRequest(json);
		String responseFromKafka = iLService.callRestClient(soapEnvelop);
		System.out.println(responseFromKafka);
		return responseFromKafka;
	}
}
