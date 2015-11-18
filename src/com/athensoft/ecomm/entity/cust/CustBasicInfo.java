package com.athensoft.ecomm.entity.cust;

public class CustBasicInfo {
	private long accountId;
	
	private String firstName;
	private String lastName;
	private String nickName;
	private String gender;
	
	
	/* date of birth */
	private int dobYear;
	private int dobMonth;
	private int dobDay;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDobYear() {
		return dobYear;
	}
	public void setDobYear(int dobYear) {
		this.dobYear = dobYear;
	}
	public int getDobMonth() {
		return dobMonth;
	}
	public void setDobMonth(int dobMonth) {
		this.dobMonth = dobMonth;
	}
	public int getDobDay() {
		return dobDay;
	}
	public void setDobDay(int dobDay) {
		this.dobDay = dobDay;
	}
	
}
