package com.af.prud.translator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prud.epos.json.classes.Assured;
import com.prud.mappers.CreateClientMapper;

public class JsonToObjectConvertor {

	public Assured createObjectFromJson(String name, String eposJson) {
		JSONParser parser = new JSONParser();
		name = "assured";

		// Object obj = parser.parse(new FileReader("input.json"));
		FileReader fileReader;
		JSONObject json = null;
		Assured assured = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			fileReader = new FileReader("input.json");
			json = (JSONObject) parser.parse(fileReader);
			assured = mapper.readValue(json.get(name).toString(), Assured.class);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null != json)
			System.out.println(json.toJSONString());
		System.out.println(assured);

		// Assured p1 = (Assured) json.get("assured");
		// System.out.println(p1);
		return assured;
	}

	public static void main(String[] args) throws Exception {
		JSONParser parser = new JSONParser();

		// Object obj = parser.parse(new FileReader("input.json"));
		FileReader fileReader = new FileReader("input.json");
		JSONObject json = (JSONObject) parser.parse(fileReader);
		// JSONObject data = (JSONObject) parser.parse(new FileReader());

		// String name = (String) jsonObject.get("name");
		System.out.println(json.toJSONString());
		// Assured p1 = (Assured) json.get("assured");
		// System.out.println(p1);

		ObjectMapper mapper = new ObjectMapper();

		Assured p = mapper.readValue(json.get("assured").toString(), Assured.class);
		System.out.println(p);
		CreateClientMapper c = new CreateClientMapper();
		EposToILTranslator e = new EposToILTranslator();
		e.jaxbObjectToXML(c.createClientFromJson(p));

		// Map<String, Object> map = new HashMap<String, Object>();
		// map = mapper.readValue(data.toString(), new TypeReference<HashMap<String,
		// Object>>() {
		// });
		// Assured p = (Assured) map.get("assured").getClass();
		// System.out.println(map.get("assured").getClass());
		// p.getAddress();
		// System.out.println(p.getAddress());
	}
}
