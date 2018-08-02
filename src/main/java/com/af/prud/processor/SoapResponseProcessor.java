package com.af.prud.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

public class SoapResponseProcessor implements Processor {
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("in processor");
		 String soaList = exchange.getIn().getBody(String.class);
	       System.out.println(soaList);
	}
}
