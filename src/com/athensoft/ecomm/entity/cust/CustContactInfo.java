package com.athensoft.ecomm.entity.cust;

public class CustContactInfo extends CustBasicInfo{
	private long accountId;
	
	private String title;       //Mr. Mrs. Ms. Dr.
	private String email1;
	private String email2;
	
	/* phone numbers */
	private String phone1;
	private String phone1_Ext;
	
	private String cellPhone;
	
	/* address */
	private String streeNum;
	private String streeName;
	private int roomType;
	private String roomNum;
	private String districtCode;
	private String cityCode;
	private String provinceCode;
	private String postalCode;
	private String countryCode;
	
	/* company info */
	private String phone2;
	private String phone2_Ext;
	
	private String companyName;
	private String companyPosition;
	
}
