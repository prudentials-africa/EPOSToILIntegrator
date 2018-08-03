package com.af.prud.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

import com.af.prud.constant.EposToILConstants;
import com.af.prud.model.CountryName;

public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("in router");
		/*from(EposToILConstants.INPUT_LOCATION)
				.setHeader(CxfConstants.OPERATION_NAME, constant(EposToILConstants.OPERATION_NAME_CONTRYNAME))
				.setHeader(CxfConstants.OPERATION_NAMESPACE,constant(EposToILConstants.OPERATION_NAMESPACE_COUNTRYINFO))
				.setBody(constant(EposToILConstants.body))
				.log("${body}").to(EposToILConstants.URL_COUNTRY_NAME)
				.to(EposToILConstants.SOAP_RESPONSE_PROCESSOR).log("ivoked soap service").to("log:output");*/
		
		from(EposToILConstants.INPUT_LOCATION)
		.setHeader(CxfConstants.OPERATION_NAME, constant("CLICRP"))
		.setHeader(CxfConstants.OPERATION_NAMESPACE,constant("http://www.csc.smart/bo/services/CLI"))
		.to(EposToILConstants.SOAP_RESPONSE_PROCESSOR)
		.setBody(constant(EposToILConstants.CREATE_CLIENT_BODY))
		.log("input payload ${CREATE_CLIENT_BODY}").to("cxf:bean:clientServiceEndpoint?defaultOperationName=CLICRP")
		.log("ivoked soap service").to("log:output");
	}

}
	