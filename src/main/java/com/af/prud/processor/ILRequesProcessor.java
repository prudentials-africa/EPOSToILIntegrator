package com.af.prud.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ILRequesProcessor implements Processor {
public String bodyPlaceHolder = null;
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("in ILRequestProcessor");
		 bodyPlaceHolder = exchange.getIn().getBody(String.class);
		 System.out.println("ILRequesProcessor process " +bodyPlaceHolder); 
	}

}
