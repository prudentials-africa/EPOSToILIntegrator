package com.af.prud.mapper.epostoil;

import com.af.prud.model.epos.AdditionalPersonalInformation;
import com.af.prud.model.epos.Assured;
import com.af.prud.model.epos.Name;
import com.af.prud.model.il.CLICRPIREC;

public class CreateClientMapper {

	public CLICRPIREC createClientFromJson(Assured assured) {
		CLICRPIREC client = new CLICRPIREC();
		// client.setADDRTYPE(value);
		if (null != assured) {
			if (null != assured.getAdditionalPersonalInformation()) {
				AdditionalPersonalInformation additionalPersonalInformation = assured
						.getAdditionalPersonalInformation();
				if (null != additionalPersonalInformation.getBirthCity())
					client.setBIRTHP(additionalPersonalInformation.getBirthCity().getName());
				if (null != additionalPersonalInformation.getCivilStatus())
					client.setMARRYD(additionalPersonalInformation.getCivilStatus().getName());
				if (null != additionalPersonalInformation.getNationality())
					client.setMARRYD(additionalPersonalInformation.getNationality().getName());

			}
			client.setCLTADDR01(assured.getAddress());
			client.setDIRMAIL(assured.getDateOfBirth());
			client.setCLTPCODE(assured.getZipcode());
			client.setCLTPHONE01(assured.getPhone());
			client.setCLTSEX(assured.getGender());
			if (null != assured.getCountry())
				client.setCTRYCODE(assured.getCountry().getCode());

			if (null != assured.getName()) {
				Name name = assured.getName();
				client.setLGIVNAME(name.getFirst());
				client.setLSURNAME(name.getLast());
				if (null != name.getTitle()) {
					client.setSALUTL(name.getTitle().getName());
				}
			}
		}

		return client;
	}

}
