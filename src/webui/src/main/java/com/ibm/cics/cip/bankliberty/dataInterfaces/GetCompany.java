package com.ibm.cics.cip.bankliberty.dataInterfaces;

import com.ibm.jzos.fields.*;

// Generated by com.ibm.jzos.recordgen.cobol.RecordClassGenerator on Tue Nov 15 10:25:10 GMT 2016
/**
 * Copyright contributors to the CICS Banking Sample Application (CBSA) project
 *
 */

public class GetCompany {
    static final String COPYRIGHT =
      "Copyright contributors to the CICS Banking Sample Application (CBSA) project.";
	protected static CobolDatatypeFactory factory = new CobolDatatypeFactory();
	static { factory.setStringTrimDefault(false); } 

	/** <pre>
	 01 COBOL-LANGUAGE-STRUCTURE. </pre> */
	public static final int COBOL_LANGUAGE_STRUCTURE_len = 40; 

	/** <pre>
	     03 GETCompanyOperation. </pre> */
	public static final int GETCOMPANYOPERATION_len = 40; 
	public static final int GETCOMPANYOPERATION_offset = factory.getOffset();

	/** <pre>
	       06 company-name pic x(40). </pre> */
	protected static StringField COMPANY_NAME = factory.getStringField(40);

	protected byte[] _byteBuffer;


	public GetCompany (byte[] buffer) {
		this._byteBuffer = buffer;
	}

	public GetCompany () {
		this._byteBuffer = new byte[COBOL_LANGUAGE_STRUCTURE_len];
	}

	public byte[] getByteBuffer() {
		return _byteBuffer;
	}


	public String getCompanyName() {
		return COMPANY_NAME.getString(_byteBuffer);
	}

	public void setCompanyName(String companyName) {
		COMPANY_NAME.putString(companyName, _byteBuffer);
	}

}
