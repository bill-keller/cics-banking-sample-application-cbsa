package com.ibm.cics.cip.bankliberty.dataInterfaces;
import com.ibm.jzos.fields.*;

// Generated by com.ibm.jzos.recordgen.cobol.RecordClassGenerator on Wed Dec 14 10:38:47 GMT 2016
/**
 * Copyright contributors to the CICS Banking Sample Application (CBSA) project
 *
 */

public class GetSortCode {
    static final String COPYRIGHT =
      "Copyright contributors to the CICS Banking Sample Application (CBSA) project.";
	protected static CobolDatatypeFactory factory = new CobolDatatypeFactory();
	static { factory.setStringTrimDefault(false); } 

	/** <pre>
	 01 COBOL-LANGUAGE-STRUCTURE. </pre> */
	public static final int COBOL_LANGUAGE_STRUCTURE_len = 6; 

	/** <pre>
	     03 GETSORTCODEOperation. </pre> */
	public static final int GETSORTCODEOPERATION_len = 6; 
	public static final int GETSORTCODEOPERATION_offset = factory.getOffset();

	/** <pre>
	       06 SORTCODE pic xXXXXX. </pre> */
	protected static StringField SORTCODE = factory.getStringField(6);

	protected byte[] _byteBuffer;


	public GetSortCode (byte[] buffer) {
		this._byteBuffer = buffer;
	}

	public GetSortCode () {
		this._byteBuffer = new byte[COBOL_LANGUAGE_STRUCTURE_len];
	}

	public byte[] getByteBuffer() {
		return _byteBuffer;
	}


	public String getSortcode() {
		return SORTCODE.getString(_byteBuffer);
	}

	public void setSortcode(String sortcode) {
		SORTCODE.putString(sortcode, _byteBuffer);
	}

}
