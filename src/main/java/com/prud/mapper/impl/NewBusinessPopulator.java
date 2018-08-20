package com.prud.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.prud.model.jpath.NewBusinessJpathModel;
import com.prud.model.middleware.NewBusinessModel;
import com.prud.translator.JsonValueExtractor;

public class NewBusinessPopulator {
	private JsonValueExtractor extractor;
	@Autowired
	private NewBusinessJpathModel jpathModel;

	public NewBusinessModel buildNewBusiness(String content) {
		extractor = new JsonValueExtractor(content);
		NewBusinessModel nbsModel = new NewBusinessModel();
		return nbsModel;
	}

}
