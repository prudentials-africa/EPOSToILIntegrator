package com.af.prud.translator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.af.prud.model.epos.Assured;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectConvertor {

	public Assured createObjectFromJson(String name, String eposJson) {
		JSONParser parser = new JSONParser();
		// name = "assured";

		// Object obj = parser.parse(new FileReader("input.json"));
		FileReader fileReader;
		JSONObject json = null;
		Assured assured = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			// fileReader = new FileReader("input.json");
			// json = (JSONObject) parser.parse(fileReader);
			json = (JSONObject) parser.parse(eposJson);
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
}
