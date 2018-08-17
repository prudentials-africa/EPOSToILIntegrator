package com.prud.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public interface IntegrationRestService {
	@RequestMapping(value = "/IL", method = RequestMethod.POST)
	@ResponseBody
	public String createILRequest(String json);
}
