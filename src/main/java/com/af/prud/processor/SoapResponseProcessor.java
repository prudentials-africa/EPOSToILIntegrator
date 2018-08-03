package com.af.prud.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

import com.prud.translators.EposToILTranslator;

public class SoapResponseProcessor implements Processor {
	public String clientCreateRequestPayload;
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("in processor");
		EposToILTranslator ePosToILTrans =new  EposToILTranslator();
		clientCreateRequestPayload=	ePosToILTrans.generateILRequest("");
		 String soaList = exchange.getIn().getBody(String.class);
	       System.out.println(soaList);
	}
}
