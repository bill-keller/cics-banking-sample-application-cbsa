package com.ibm.cics.cip.bankliberty.dataInterfaces;
import com.ibm.jzos.fields.*;

// Generated by IBM Record Generator for Java V3.0.0 Build 20170904-1704 on: Fri Mar 13 11:18:25 GMT 2020


/**
 * Copyright contributors to the CICS Banking Sample Application (CBSA) project
 *
 */

public class CustomerControl {
    static final String COPYRIGHT =
      "Copyright contributors to the CICS Banking Sample Application (CBSA) project.";
	protected static CobolDatatypeFactory factory = new CobolDatatypeFactory();
	static { factory.setStringTrimDefault(false); } 

	/** <pre>
	 01 COBOL-LANGUAGE-STRUCTURE. </pre> */
	public static final int COBOL_LANGUAGE_STRUCTURE_len = 329; 

	/** <pre>
	     03 CUSTOMER-CONTROL-RECORD. </pre> */
	public static final int CUSTOMER_CONTROL_RECORD_len = 329; 
	public static final int CUSTOMER_CONTROL_RECORD_offset = factory.getOffset();

	/** <pre>
	        05 CUSTOMER-CONTROL-EYECATCHER             PIC X(4). </pre> */
	protected static final StringField CUSTOMER_CONTROL_EYECATCHER = factory.getStringField(4);

	/** <pre>
	           88 CUSTOMER-CONTROL-EYECATCHER-V        VALUE 'CTRL'. </pre> */
	public static final String CUSTOMER_CONTROL_EYECATCHER_V = "CTRL";

	/** <pre>
	        05 CUSTOMER-CONTROL-KEY. </pre> */
	public static final int CUSTOMER_CONTROL_KEY_len = 16; 
	public static final int CUSTOMER_CONTROL_KEY_offset = factory.getOffset();

	/** <pre>
	           07 CUSTOMER-CONTROL-SORTCODE        PIC 9(6) DISPLAY. </pre> */
	protected static final ExternalDecimalAsIntField CUSTOMER_CONTROL_SORTCODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	           07 CUSTOMER-CONTROL-NUMBER          PIC 9(10) DISPLAY. </pre> */
	protected static final ExternalDecimalAsLongField CUSTOMER_CONTROL_NUMBER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	        05 NUMBER-OF-CUSTOMERS                 PIC 9(10) DISPLAY. </pre> */
	protected static final ExternalDecimalAsLongField NUMBER_OF_CUSTOMERS = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	        05 LAST-CUSTOMER-NUMBER                PIC 9(10) DISPLAY. </pre> */
	protected static final ExternalDecimalAsLongField LAST_CUSTOMER_NUMBER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	        05 CUSTOMER-CONTROL-SUCCESS-FLAG       PIC X. </pre> */
	protected static final StringField CUSTOMER_CONTROL_SUCCESS_FLAG = factory.getStringField(1);

	/** <pre>
	        88 CUSTOMER-CONTROL-SUCCESS VALUE 'Y'. </pre> */
	public static final String CUSTOMER_CONTROL_SUCCESS = "Y";

	/** <pre>
	        05 CUSTOMER-CONTROL-FAIL-CODE PIC X. </pre> */
	protected static final StringField CUSTOMER_CONTROL_FAIL_CODE = factory.getStringField(1);

	/** <pre>
	        05 FILLER                              PIC X(38). </pre> */
	protected static final StringField FILLER_1 = factory.getStringField(38);

	/** <pre>
	        05 FILLER                              PIC X(160). </pre> */
	protected static final StringField FILLER_2 = factory.getStringField(160);

	/** <pre>
	        05 FILLER                              PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField FILLER_3 = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	        05 FILLER                              PIC 999. </pre> */
	protected static final ExternalDecimalAsIntField FILLER_4 = factory.getExternalDecimalAsIntField(3, false, false, false, false);

	/** <pre>
	        05 FILLER                              PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField FILLER_5 = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	        05 FILLER                              PIC 9(11). </pre> */
	protected static final ExternalDecimalAsLongField FILLER_6 = factory.getExternalDecimalAsLongField(11, false, false, false, false);

	/** <pre>
	        05 FILLER                              PIC X(50). </pre> */
	protected static final StringField FILLER_7 = factory.getStringField(50);

	/** <pre>
	        05 FILLER                              PIC X(9). </pre> */
	protected static final StringField FILLER_8 = factory.getStringField(9);

	protected byte[] _byteBuffer;
	// Instance variables used to cache field values
	protected String customerControlEyecatcher;
	protected Integer customerControlSortcode;
	protected Long customerControlNumber;
	protected Long numberOfCustomers;
	protected Long lastCustomerNumber;
	protected String customerControlSuccessFlag;
	protected String customerControlFailCode;
	protected String filler_1;
	protected String filler_2;
	protected Integer filler_3;
	protected Integer filler_4;
	protected Integer filler_5;
	protected Long filler_6;
	protected String filler_7;
	protected String filler_8;


	public CustomerControl (byte[] buffer) {
		this._byteBuffer = buffer;
	}

	public CustomerControl () {
		this._byteBuffer = new byte[COBOL_LANGUAGE_STRUCTURE_len];
	}

	public byte[] getByteBuffer() {
		return _byteBuffer;
	}


	public String getCustomerControlEyecatcher() {
		if (customerControlEyecatcher == null) {
			customerControlEyecatcher = CUSTOMER_CONTROL_EYECATCHER.getString(_byteBuffer);
		}
		return customerControlEyecatcher;
	}

	public void setCustomerControlEyecatcher(String customerControlEyecatcher) {
		if (CUSTOMER_CONTROL_EYECATCHER.equals(this.customerControlEyecatcher, customerControlEyecatcher)) {
			return;
		}
		CUSTOMER_CONTROL_EYECATCHER.putString(customerControlEyecatcher, _byteBuffer);
		this.customerControlEyecatcher = customerControlEyecatcher;
	}

	public boolean isCustomerControlEyecatcherV() {
		return getCustomerControlEyecatcher().equals(CUSTOMER_CONTROL_EYECATCHER_V);
	}

	public int getCustomerControlSortcode() {
		if (customerControlSortcode == null) {
			customerControlSortcode = new Integer(CUSTOMER_CONTROL_SORTCODE.getInt(_byteBuffer));
		}
		return customerControlSortcode.intValue();
	}

	public void setCustomerControlSortcode(int customerControlSortcode) {
		if (CUSTOMER_CONTROL_SORTCODE.equals(this.customerControlSortcode, customerControlSortcode)) {
			return;
		}
		CUSTOMER_CONTROL_SORTCODE.putInt(customerControlSortcode, _byteBuffer);
		this.customerControlSortcode = new Integer(customerControlSortcode);
	}

	public long getCustomerControlNumber() {
		if (customerControlNumber == null) {
			customerControlNumber = new Long(CUSTOMER_CONTROL_NUMBER.getLong(_byteBuffer));
		}
		return customerControlNumber.longValue();
	}

	public void setCustomerControlNumber(long customerControlNumber) {
		if (CUSTOMER_CONTROL_NUMBER.equals(this.customerControlNumber, customerControlNumber)) {
			return;
		}
		CUSTOMER_CONTROL_NUMBER.putLong(customerControlNumber, _byteBuffer);
		this.customerControlNumber = new Long(customerControlNumber);
	}

	public long getNumberOfCustomers() {
		if (numberOfCustomers == null) {
			numberOfCustomers = new Long(NUMBER_OF_CUSTOMERS.getLong(_byteBuffer));
		}
		return numberOfCustomers.longValue();
	}

	public void setNumberOfCustomers(long numberOfCustomers) {
		if (NUMBER_OF_CUSTOMERS.equals(this.numberOfCustomers, numberOfCustomers)) {
			return;
		}
		NUMBER_OF_CUSTOMERS.putLong(numberOfCustomers, _byteBuffer);
		this.numberOfCustomers = new Long(numberOfCustomers);
	}

	public long getLastCustomerNumber() {
		if (lastCustomerNumber == null) {
			lastCustomerNumber = new Long(LAST_CUSTOMER_NUMBER.getLong(_byteBuffer));
		}
		return lastCustomerNumber.longValue();
	}

	public void setLastCustomerNumber(long lastCustomerNumber) {
		if (LAST_CUSTOMER_NUMBER.equals(this.lastCustomerNumber, lastCustomerNumber)) {
			return;
		}
		LAST_CUSTOMER_NUMBER.putLong(lastCustomerNumber, _byteBuffer);
		this.lastCustomerNumber = new Long(lastCustomerNumber);
	}

	public String getCustomerControlSuccessFlag() {
		if (customerControlSuccessFlag == null) {
			customerControlSuccessFlag = CUSTOMER_CONTROL_SUCCESS_FLAG.getString(_byteBuffer);
		}
		return customerControlSuccessFlag;
	}

	public void setCustomerControlSuccessFlag(String customerControlSuccessFlag) {
		if (CUSTOMER_CONTROL_SUCCESS_FLAG.equals(this.customerControlSuccessFlag, customerControlSuccessFlag)) {
			return;
		}
		CUSTOMER_CONTROL_SUCCESS_FLAG.putString(customerControlSuccessFlag, _byteBuffer);
		this.customerControlSuccessFlag = customerControlSuccessFlag;
	}

	public boolean isCustomerControlSuccess() {
		return getCustomerControlSuccessFlag().equals(CUSTOMER_CONTROL_SUCCESS);
	}

	public String getCustomerControlFailCode() {
		if (customerControlFailCode == null) {
			customerControlFailCode = CUSTOMER_CONTROL_FAIL_CODE.getString(_byteBuffer);
		}
		return customerControlFailCode;
	}

	public void setCustomerControlFailCode(String customerControlFailCode) {
		if (CUSTOMER_CONTROL_FAIL_CODE.equals(this.customerControlFailCode, customerControlFailCode)) {
			return;
		}
		CUSTOMER_CONTROL_FAIL_CODE.putString(customerControlFailCode, _byteBuffer);
		this.customerControlFailCode = customerControlFailCode;
	}

	public String getFiller_1() {
		if (filler_1 == null) {
			filler_1 = FILLER_1.getString(_byteBuffer);
		}
		return filler_1;
	}

	public void setFiller_1(String filler_1) {
		if (FILLER_1.equals(this.filler_1, filler_1)) {
			return;
		}
		FILLER_1.putString(filler_1, _byteBuffer);
		this.filler_1 = filler_1;
	}

	public String getFiller_2() {
		if (filler_2 == null) {
			filler_2 = FILLER_2.getString(_byteBuffer);
		}
		return filler_2;
	}

	public void setFiller_2(String filler_2) {
		if (FILLER_2.equals(this.filler_2, filler_2)) {
			return;
		}
		FILLER_2.putString(filler_2, _byteBuffer);
		this.filler_2 = filler_2;
	}

	public int getFiller_3() {
		if (filler_3 == null) {
			filler_3 = new Integer(FILLER_3.getInt(_byteBuffer));
		}
		return filler_3.intValue();
	}

	public void setFiller_3(int filler_3) {
		if (FILLER_3.equals(this.filler_3, filler_3)) {
			return;
		}
		FILLER_3.putInt(filler_3, _byteBuffer);
		this.filler_3 = new Integer(filler_3);
	}

	public int getFiller_4() {
		if (filler_4 == null) {
			filler_4 = new Integer(FILLER_4.getInt(_byteBuffer));
		}
		return filler_4.intValue();
	}

	public void setFiller_4(int filler_4) {
		if (FILLER_4.equals(this.filler_4, filler_4)) {
			return;
		}
		FILLER_4.putInt(filler_4, _byteBuffer);
		this.filler_4 = new Integer(filler_4);
	}

	public int getFiller_5() {
		if (filler_5 == null) {
			filler_5 = new Integer(FILLER_5.getInt(_byteBuffer));
		}
		return filler_5.intValue();
	}

	public void setFiller_5(int filler_5) {
		if (FILLER_5.equals(this.filler_5, filler_5)) {
			return;
		}
		FILLER_5.putInt(filler_5, _byteBuffer);
		this.filler_5 = new Integer(filler_5);
	}

	public long getFiller_6() {
		if (filler_6 == null) {
			filler_6 = new Long(FILLER_6.getLong(_byteBuffer));
		}
		return filler_6.longValue();
	}

	public void setFiller_6(long filler_6) {
		if (FILLER_6.equals(this.filler_6, filler_6)) {
			return;
		}
		FILLER_6.putLong(filler_6, _byteBuffer);
		this.filler_6 = new Long(filler_6);
	}

	public String getFiller_7() {
		if (filler_7 == null) {
			filler_7 = FILLER_7.getString(_byteBuffer);
		}
		return filler_7;
	}

	public void setFiller_7(String filler_7) {
		if (FILLER_7.equals(this.filler_7, filler_7)) {
			return;
		}
		FILLER_7.putString(filler_7, _byteBuffer);
		this.filler_7 = filler_7;
	}

	public String getFiller_8() {
		if (filler_8 == null) {
			filler_8 = FILLER_8.getString(_byteBuffer);
		}
		return filler_8;
	}

	public void setFiller_8(String filler_8) {
		if (FILLER_8.equals(this.filler_8, filler_8)) {
			return;
		}
		FILLER_8.putString(filler_8, _byteBuffer);
		this.filler_8 = filler_8;
	}

}
