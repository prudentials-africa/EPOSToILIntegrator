package com.af.prud.translator;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Component;

import com.af.prud.mapper.epostoil.CreateClientMapper;
import com.af.prud.model.epos.Assured;
import com.af.prud.model.il.CLICRPIREC;

@Component
public class EposToILTranslator {
	static CreateClientMapper clientMapper = new CreateClientMapper();

	static String jaxbObjectToXML(CLICRPIREC CLICRPIREC) {
		StringWriter sw = null;
		try {
			JAXBContext context = JAXBContext.newInstance(CLICRPIREC.class);
			Marshaller m = context.createMarshaller();
			// for pretty-print XML in JAXB
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write to System.out for debugging
			// m.marshal(CLICRPIREC, System.out);
			sw = new StringWriter();
			m.marshal(CLICRPIREC, sw);

			// String result = sw.toString();
			System.out.println("STRING --------------------" + sw.toString());
			// Write to File
			// m.marshal(emp, new File(FILE_NAME));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();

	}

	public String generateILRequest(String json) {
		JsonToObjectConvertor jsonToObjectConvertor = new JsonToObjectConvertor();
		Assured assured = jsonToObjectConvertor.createObjectFromJson("assured", json);
		// clientMapper.createClientFromJson(assured);
		String s = EposToILTranslator.jaxbObjectToXML(clientMapper.createClientFromJson(assured));
		stubEnvelop(s);
		return null;

	}

	private void stubEnvelop(String s) {

	}

	public static void main(String[] args) {
		JsonToObjectConvertor jsonToObjectConvertor = new JsonToObjectConvertor();
		Assured assured = jsonToObjectConvertor.createObjectFromJson("assured", "jsonString");
		// clientMapper.createClientFromJson(assured);
		String xmlString = EposToILTranslator.jaxbObjectToXML(clientMapper.createClientFromJson(assured));
		System.out.println("-----------------------------------------MAIN-----------" + xmlString);
	}
}
