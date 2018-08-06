package com.af.prud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.af.prud.mapper.epostoil.OrikaModelMapper;
import com.af.prud.service.ILServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class IlRequesGeneratorController {
	@Autowired
	private ILServiceImpl ilServiceImpl;
	

	@RequestMapping(value = "/IL", method = RequestMethod.POST)
	@ResponseBody
	public void createILRequest(@RequestBody String json) {
		System.out.println(json);
		ilServiceImpl.serviceRequest(json);
	}
}
