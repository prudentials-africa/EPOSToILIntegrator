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

	public static final String CREATE_CLIENT_BODY = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:clic=\"http://www.csc.smart/bo/schemas/CLICRPI\" xmlns:msp=\"http://www.csc.smart/msp/schemas/MSPContext\">"
			+ "<soapenv:Header/>" + "<soapenv:Body>" + "<clic:CLICRPI_REC>"
			+ "<!--Optional:-->" + "<msp:MSPContext>" + "<!--Optional:-->"
			+ "<msp:UserId>ld8test</msp:UserId>" + "<!--Optional:-->"
			+ "<msp:UserPassword>q1w2e3r4</msp:UserPassword>" + "<!--Optional:-->"
			+ "<msp:RequestParameters>" + "<!--Zero or more repetitions:-->"
			+ "<msp:RequestParameter name=\"\" value=\"?\"/>"
			+ "</msp:RequestParameters>" + "</msp:MSPContext>"
			+ "<ADDRTYPE>R</ADDRTYPE>" + "<BIRTHP></BIRTHP>"
			+ "<CLTADDR01>Uganda</CLTADDR01>" + "<CLTADDR02></CLTADDR02>"
			+ "<CLTADDR03></CLTADDR03>" + "<CLTADDR04></CLTADDR04>"
			+ "<CLTADDR05></CLTADDR05>" + "<CLTDOBX>" + "<CCYY>1982</CCYY>"
			+ "<MM>07</MM>" + "<DD>29</DD>" + "</CLTDOBX>"
			+ "<CLTPCODE></CLTPCODE>" + "<CLTPHONE01></CLTPHONE01>"
			+ "<CLTPHONE02></CLTPHONE02>" + "<CLTSEX>M</CLTSEX>"
			+ "<CTRYCODE>UGD</CTRYCODE>" + "<DIRMAIL></DIRMAIL>"
			+ "<DOCNO></DOCNO>" + "<LGIVNAME>GUPTA</LGIVNAME>"
			+ "<LSURNAME>RAVI</LSURNAME>" + "<MAILING>R</MAILING>"
			+ "<MARRYD>M</MARRYD>" + "<NATLTY>EAU</NATLTY>"
			+ "<OCCPCODE></OCCPCODE>" + "<SALUTL>MR</SALUTL>"
			+ "<SECUITYNO></SECUITYNO>" + "<SOE></SOE>" + "<STATCODE></STATCODE>"
			+ "<VIP></VIP>" + "</clic:CLICRPI_REC>" + "</soapenv:Body>"
			+ "</soapenv:Envelope>";
}
