package com.af.prud.constant;

public class EposToILConstants {
	private EposToILConstants() {

	}

	public static final String body = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.oorsprong.org/websamples.countryinfo\">"
			+ "<soapenv:Header/>" + "<soapenv:Body>" + "<web:CountryName>"
			+ "<web:sCountryISOCode>USA</web:sCountryISOCode>" + "</web:CountryName>" + "</soapenv:Body>"
			+ "</soapenv:Envelope>";
	public static final String INPUT_LOCATION = "file:C:/D/Prudential/dev1/EPOSToILIntegrator/input";
	public static final String OPERATION_NAME_CONTRYNAME = "CountryName";
	public static final String OPERATION_NAMESPACE_COUNTRYINFO = "http://www.oorsprong.org/websamples.countryinfo";
	public static final String URL_COUNTRY_NAME = "cxf:bean:serviceEndpoint?defaultOperationName=CountryName";
	public static final String SOAP_RESPONSE_PROCESSOR = "soapResponseProcessor";
	public static final String SOAPENVELOP_FOOTER = "</soapenv:Body></soapenv:Envelope>";
	public static final String SOAPENVELOP_HEADER = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Header/><soapenv:Body>";

	
}
