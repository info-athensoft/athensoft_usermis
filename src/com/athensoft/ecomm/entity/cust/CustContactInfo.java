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
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone1_Ext() {
		return phone1_Ext;
	}
	public void setPhone1_Ext(String phone1_Ext) {
		this.phone1_Ext = phone1_Ext;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getStreeNum() {
		return streeNum;
	}
	public void setStreeNum(String streeNum) {
		this.streeNum = streeNum;
	}
	public String getStreeName() {
		return streeName;
	}
	public void setStreeName(String streeName) {
		this.streeName = streeName;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone2_Ext() {
		return phone2_Ext;
	}
	public void setPhone2_Ext(String phone2_Ext) {
		this.phone2_Ext = phone2_Ext;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyPosition() {
		return companyPosition;
	}
	public void setCompanyPosition(String companyPosition) {
		this.companyPosition = companyPosition;
	}
	
}
