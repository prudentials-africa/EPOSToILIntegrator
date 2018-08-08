package com.af.prud.mapper.epostoil;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.af.prud.constant.EposToILConstants;
import com.af.prud.model.il.CLICRPIREC;
import com.af.prud.model.il.CLICRPIREC.CLTDOBX;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class CreateClientCustomConverter extends CustomConverter<String, CLTDOBX> {

	@Override
	public CLTDOBX convert(String source, Type<? extends CLTDOBX> destinationType) {
		String s = source;
		Date d = null;
		try {
			d = new SimpleDateFormat(EposToILConstants.CLTDOBX_FORMAT).parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		CLICRPIREC client = new CLICRPIREC();
		CLTDOBX cltDOBX = new CLTDOBX();
		cltDOBX.setCCYY(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMM(BigInteger.valueOf(cal.get(Calendar.MONTH)+1));
		cltDOBX.setDD(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		client.setCLTDOBX(cltDOBX);
		return cltDOBX;
	}
	
}
