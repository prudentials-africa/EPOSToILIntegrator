package com.prud.service;

import org.springframework.stereotype.Service;

@Service
public interface ILService {

	public String serviceRequest(String json);

	public String callRestClient(String soapEnvelop);
}
