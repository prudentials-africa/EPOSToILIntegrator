package com.af.prud.mapper.epostoil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.af.prud.model.middleware.ClientDetails;
@Component
public class ClientPopulator {
	private JsonValueExtractor extractor;
	@Autowired
	private EposJpathModel eposJpathModel;

	public ClientDetails buildClient(String content) {
		extractor= new JsonValueExtractor(content);
		ClientDetails cd = new ClientDetails();
		cd.setBirthPlace(extractor.fetchString(eposJpathModel.getCity()));
		cd.setAddress01(extractor.fetchString(eposJpathModel.getAddress()));
		cd.setPostalCode(extractor.fetchString(eposJpathModel.getZipcode()));
		cd.setPhone01(extractor.fetchString(eposJpathModel.getPhone()));
		cd.setGender(extractor.fetchString(eposJpathModel.getGender()));
		cd.setCountryCode(extractor.fetchString(eposJpathModel.getCountryCode()));
		cd.setGivenName(extractor.fetchString(eposJpathModel.getFirstName()));
		cd.setSurName(extractor.fetchString(eposJpathModel.getLastName()));
		cd.setMarriedIndicator(extractor.fetchString(eposJpathModel.getStatus()));
		cd.setNationality(extractor.fetchString(eposJpathModel.getNationality()));
		cd.setOccupationCode(extractor.fetchString(eposJpathModel.getOccupationCode()));
		cd.setSalutaion(extractor.fetchString(eposJpathModel.getSalutation()));
		return cd;
	}

}
