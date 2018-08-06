package com.af.prud.mapper.epostoil;

import java.math.BigInteger;

import com.af.prud.model.epos.AdditionalPersonalInformation;
import com.af.prud.model.epos.Assured;
import com.af.prud.model.epos.Name;
import com.af.prud.model.il.CLICRPIREC;
import com.af.prud.model.il.CLICRPIREC.CLTDOBX;
import com.af.prud.model.il.MSPContext;
import com.af.prud.model.il.RequestParameter;
import com.af.prud.model.il.RequestParameters;

public class CreateClientMapper {

	public CLICRPIREC createClientFromJson(Assured assured) {
		CLICRPIREC client = new CLICRPIREC();
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
			CLTDOBX dob = new CLTDOBX();
			dob.setCCYY(new BigInteger("2018"));
			dob.setDD(new BigInteger("12"));
			dob.setMM(new BigInteger("03"));
			client.setCLTDOBX(dob);
			MSPContext msCTX = new MSPContext();
			msCTX.setUserId("LD8ACC1");
			msCTX.setUserPassword("q1w2e3r4");
			RequestParameters reqParas = new RequestParameters();
			RequestParameter reqPara = new RequestParameter();
			reqPara.setName("COMPANY");
			reqPara.setValue("U");
			reqParas.getRequestParameter().add(reqPara);
			msCTX.setRequestParameters(reqParas);
			client.setADDRTYPE("R");
			
			client.setMSPContext(msCTX);
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
