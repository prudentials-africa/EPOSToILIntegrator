package com.af.prud.translator;

import java.io.StringWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.af.prud.mapper.epostoil.CreateClientMapper;
import com.af.prud.mapper.epostoil.OrikaModelMapper;
import com.af.prud.mapper.epostoil.XSLTransformer;
import com.af.prud.model.epos.Assured;
import com.af.prud.model.il.CLICRPIREC;

@Component
public class EposToILTranslator {
	@Autowired
	private XSLTransformer xslTransformer;
	static CreateClientMapper clientMapper = new CreateClientMapper();
	@Autowired
	private OrikaModelMapper orikaModelConverter;
	@Resource(name = "eposToILMappingProperty")
	private Map<String, String> eposToILProperties;

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
			System.out.println(sw.toString());
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
		CLICRPIREC clientCreate = (CLICRPIREC) orikaModelConverter.map(assured, Assured.class, CLICRPIREC.class,
				eposToILProperties);
		// clientMapper.createClientFromJson(assured);
		String s = EposToILTranslator.jaxbObjectToXML(clientCreate);
		return stubEnvelop(s);
	}

	private String stubEnvelop(String body) {
		return xslTransformer.transform("input-to-output.xsl", body);
	}
}
