package com.af.prud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.af.prud.translator.EposToILTranslator;

@RestController
@CrossOrigin(origins = "*")

public class IlRequesGeneratorController {
	@Autowired
	EposToILTranslator eposToILTranslator;

	@RequestMapping(value = "/IL/", method = RequestMethod.POST)
	@ResponseBody
	public void createILRequest(@RequestBody String json) {
		eposToILTranslator.generateILRequest(json);
		System.out.println(json);
	}
}
