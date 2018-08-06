package com.af.prud.mapper.epostoil;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTransformer {
	public String transform(String xslFileName, String source) {
		String result = null;
		String xslFile = getClass().getResource("xsl/"+xslFileName).getFile();
		try (StringReader reader = new StringReader(source); StringWriter writer = new StringWriter()) {

			StreamSource xslCode = new StreamSource(new File(xslFile));
			StreamSource input = new StreamSource(reader);
			StreamResult output = new StreamResult(writer);

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer(xslCode);
			t.transform(input, output);
			result = writer.toString();
		} catch (TransformerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
